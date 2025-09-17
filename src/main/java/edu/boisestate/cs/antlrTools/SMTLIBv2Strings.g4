grammar SMTLIBv2Strings;

// Lexer Rules Start

ParOpen: '(';
ParClose: ')';

// Commands
CMD_checksat: 'check-sat';
CMD_declarefun: 'declare-fun';
CMD_declareconst: 'declare-const';
CMD_setinfo: 'set-info';
CMD_setlogic: 'set-logic';
CMD_getmodel: 'get-model';
CMD_exit: 'exit';

// Assignment and Assertion
Assert: 'assert';
Let: 'let';

//Predicates
And: 'and';
Not: 'not';
Equals: '=';
Or: 'or';
LT: 'str.<';
StrInRE: 'str.in_re';
LTE: 'str.<=';
Prefix: 'str.prefixof';
Suffix: 'str.suffixof';
Contains: 'str.contains';

//Operations
StringConcat: 'str.++';
StringReplace: 'str.replace';
StringReplaceAll: 'str.replace_all';
StringReplaceRE: 'str.replace_re';
StringReplaceREAll: 'str.replace_re_all';
StringAt: 'str.at';

REfromString: 'str.to_re';
REConcat: 're.++';
REUnion: 're.union';
REInter: 're.inter';
REKleeneClose: 're.*';
REComp: 're.comp';
REDiff: 're.diff';
REKleenCross: 're.+' ;
REOpt: 're.opt' ;
RERange: 're.range' ;
REIndex: '_ re.^';
RELoop: '_ re.loop';

// Constants (and concretes)

REConst: 're.none'
    | 're.all'
    | 're.allchar'
    ;
String: '"' (PrintableCharNoDquote | WhiteSpaceChar)* '"';

Int: [0-9]+;

// Symbolic
SymbolicType: 'String';
VAR: [a-zA-Z0-9_]+;

// Header of query

Info: [a-zA-Z0-9.]+
    | String
    | '|' (PrintableCharNoBackslash | WhiteSpaceChar)+ '|'
    ;

InfoKW: ':source'
    | ':category'
    | ':smt-lib-version'
    | ':license'
    | ':status';


fragment PrintableCharNoBackslash
    : '\u0020' .. '\u005B'
    | '\u005D' .. '\u007B'
    | '\u007D' .. '\u007E'
    | '\u0080' .. '\uffff'
    | EscapedSpace
    ;

fragment PrintableCharNoDquote
    : '\u0020' .. '\u0021'
    | '\u0023' .. '\u007E'
    | '\u0080' .. '\uffff'
    | EscapedSpace
    ;

fragment EscapedSpace
    : '""'
    ;

fragment WhiteSpaceChar
    : '\u0009'
    | '\u000A'
    | '\u000D'
    | '\u0020'
    ;


// Parser Rules Start

script: command+ stringTheory+ command+;

cmd_checkSat: CMD_checksat;

cmd_getModel: CMD_getmodel;

cmd_declareFun
    : CMD_declarefun VAR ParOpen ParClose SymbolicType
    ;

cmd_declareConst: CMD_declareconst VAR SymbolicType;

cmd_exit
    : CMD_exit
    ;

cmd_setInfo
    : CMD_setinfo InfoKW info+
    ;

cmd_setLogic
    : CMD_setlogic info
    ;

command
    : ParOpen cmd_checkSat ParClose
    | ParOpen cmd_getModel ParClose
    | ParOpen cmd_declareFun ParClose
    | ParOpen cmd_declareConst ParClose
    | ParOpen cmd_exit ParClose
    | ParOpen cmd_setInfo ParClose
    | ParOpen cmd_setLogic ParClose
    ;

info: Info
    | String
    | VAR;

stringTheory: ParOpen Assert expr ParClose;

expr: ParOpen Let ParOpen ParOpen VAR expr ParClose ParClose expr ParClose
    | ParOpen And expr expr ParClose
    | ParOpen Not expr ParClose
    | ParOpen Equals expr expr ParClose
    // had to add these 3 other rules for query2885 basically
    | ParOpen Equals string expr ParClose
    | ParOpen Equals expr string ParClose
    | ParOpen Equals string string ParClose

    | ParOpen Or expr expr+ ParClose
    | ParOpen funString ParClose
    | ParOpen funRegLan ParClose
    | ParOpen fun ParClose
    // | string //potentially only needed for equals as well when comparing strings
    ;
funString: StringConcat string string+
    | StringReplace string string string
    | StringReplaceAll string string string
    | StringReplaceRE string reglan string
    | StringReplaceREAll string reglan string
    | StringAt string Int
    ;

funRegLan: REfromString string
    | REConcat reglan reglan+
    | REUnion reglan reglan+
    | REInter reglan reglan+
    | REKleeneClose reglan
    | REComp reglan
    | REDiff reglan reglan+
    | REKleenCross reglan
    | REOpt reglan
    | RERange string string
    // | ParOpen REIndex VAR ParClose reglan reglan
    | ParOpen RELoop Int Int ParClose reglan 
    ;

fun: LT string string
    | StrInRE string reglan
    | LTE string string
    | Prefix string string
    | Suffix string string
    | Contains string string
    | VAR
    ;

string: String
    | VAR
    | ParOpen funString ParClose
    ;

reglan: REConst
    | ParOpen funRegLan ParClose
    | VAR
    ;

 WS: [ \r\n\t]+ -> skip;

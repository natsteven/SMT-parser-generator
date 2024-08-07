(set-info :smt-lib-version 2.6)
(set-logic QF_S)
(set-info :source |
Generated by: Joel Day, Thorsten Ehlers, Mitja Kulczynski, Federico Mora, Florin Manea, Dirk Nowotka, Danny Poulsen, Zhengyang Lu
Application: Test WOORPJE
Target solver: WOORPJE
Publications: Day, J. D., Ehlers, T., Kulczynski, M., Manea, F., Nowotka, D., & Poulsen, D. B. (2019). On solving word equations using SAT. In RP 2019
Description: Consisting of a system of 100 small random word equations with at most 6 letters, 10 variables and length 60.
|)
(set-info :license "https://creativecommons.org/licenses/by/4.0/")
(set-info :category "random")
(set-info :status unknown)

(declare-fun B () String)
(declare-fun A () String)
(declare-fun C () String)
(assert (= (str.++  "dddd" A "fefc")  (str.++  "ddddc" B "edeebcdfefc") ))
(assert (= (str.++  "bcfbebddcbbdcbfafdcdee" "")  (str.++  "bcfbebddcbbdcbfaf" C) ))
(assert (= (str.++  "afecadeebdcdeefcdfffdb" "")  (str.++  "afecadeeb" C "fcdfffdb") ))
(assert (= (str.++  "dddccafbcfb" A "bdc")  (str.++  "dddccafbcfbfcabfebbbdc" "") ))
(assert (= (str.++  "ecdfcadacaaa" B "afeebe")  (str.++  "ecdfcadacaaa" B "afeebe") ))
(assert (= (str.++  "daefcdfbfedafbfcdffbaf" "")  (str.++  "daefcdfbfeda" B "dffbaf") ))
(assert (= (str.++  "cbfbdeabfefeeaefbfcaaa" "")  (str.++  "cbfbdeabfefeeae" B "aaa") ))
(assert (= (str.++  "ebebfceacefccadefe" B)  (str.++  "ebebfceacefccadefe" B) ))
(assert (= (str.++  "faeeaac" B "bedffceaeed")  (str.++  "faeeaacfbfcbedffceaeed" "") ))
(assert (= (str.++  "fe" B "efcfcefeccdddadd")  (str.++  "fefbfcefcfcefeccdddadd" "") ))
(assert (= (str.++  "fedcedafff" B "cfdccfba")  (str.++  "fedcedaffffbfccfdccfba" "") ))
(assert (= (str.++  "dcdafbbeeabcadef" B "cf")  (str.++  "dcdafbbeeabcadeffbfccf" "") ))
(assert (= (str.++  "ebbcbccaaedbcecece" B)  (str.++  "ebbcbccaaedbcececefbfc" "") ))
(assert (= (str.++  "aaeaae" C)  (str.++  "aaeaaefdcebadfadabbcae" "") ))
(assert (= (str.++  "cdbbdaff" A "aefaecf")  (str.++  "cdbbdaffbadfadaaefaecf" "") ))
(assert (= (str.++  "dbf" A "dfbaabdc")  (str.++  "dbf" A "dfbaabdc") ))
(assert (= (str.++  "eede" C "bde" C "fbdbefaceeaab")  (str.++  "eedeb" C "debfbdbefaceeaa" C) ))
(assert (= (str.++  "daddbbcb" C "ceba" C "bfdf" C C "ee")  (str.++  "daddb" C "c" C "bce" C "a" C C "fdfb" C "ee") ))
(assert (= (str.++  "cdc" C "dffc" C "cafdfbeaffaf" C)  (str.++  "cdc" C "dffcbcafdfbeaffaf" C) ))
(assert (= (str.++  "fdccecbdfbbc" C "e" C "a" C "deecd")  (str.++  "fdccec" C "df" C "bc" C "e" C "a" C "deecd") ))
(assert (= (str.++  "adedbccaeafecad" C "debaee")  (str.++  "adedbccaeafecadbde" C "aee") ))
(assert (= (str.++  "fedfdfed" C "cdffc" C "ceecbbb")  (str.++  "fedfdfedbcdffc" C "ceecbbb") ))
(assert (= (str.++  C "acede" C "d" C "bfcbe" C "adfbedc")  (str.++  "bacedebdbbfc" C "ebadf" C "edc") ))
(assert (= (str.++  "daffccbbfeed" C C C "dbafbfe")  (str.++  "daffcc" C "bfeedb" C "bdbafbfe") ))
(assert (= (str.++  "caaefcaaeedddcad" C "bcfaf")  (str.++  "caaefcaaeedddcadbbcfaf" "") ))
(assert (= (str.++  "bdfedfaeecfcfbbeaefef" C)  (str.++  "bdfedfaeecfcfbbeaefefb" "") ))
(assert (= (str.++  "dfdefdeaecedeaa" C "cceafe")  (str.++  "dfdefdeaecedeaa" C "cceafe") ))
(assert (= (str.++  "fedaae" C "debefaaefdf" C "ade")  (str.++  "fedaae" C "de" C "efaaefdf" C "ade") ))
(assert (= (str.++  "cbdca" C "cfcdbdadcc" C "fecfc")  (str.++  "cbdcabcfcd" C "dadccbfecfc") ))
(assert (= (str.++  "eeddaca" C "def" C "cafecaa" C "da")  (str.++  "eeddaca" C "def" C "cafecaa" C "da") ))
(assert (= (str.++  C "dfaebddeccafacfcfcadd" "")  (str.++  "bdfaebddeccafacfcfcadd" "") ))
(assert (= (str.++  "ecdbfacebecfcdaacdfbec" "")  (str.++  "ecd" C "facebecfcdaacdfbec") ))
(assert (= (str.++  "cdcfcefdcaf" C "ccbaccbac" C)  (str.++  "cdcfcefdcafbccbacc" C "acb") ))
(assert (= (str.++  "cdbcdec" C "a" C "ceebdddceaea")  (str.++  "cdbcdecbabcee" C "dddceaea") ))
(assert (= (str.++  "bdcfdffdece" C "dffccdadeb")  (str.++  C "dcfdffdecebdffccdadeb" "") ))
(assert (= (str.++  "fdfeeca" C "deaccdedecfdfa")  (str.++  "fdfeecabdeaccdedecfdfa" "") ))
(assert (= (str.++  "dcbffdbcddfffafaefaeee" "")  (str.++  "dc" C "ffdbcddfffafaefaeee") ))
(assert (= (str.++  "cdcdc" C "daabdfdadaded" C "df")  (str.++  "cdcdcbdaabdfdadadedbdf" "") ))
(assert (= (str.++  "acbbfb" C "dcdfcccaefcdeb" C)  (str.++  "acbbf" C C "dcdfcccaefcdeb" C) ))
(assert (= (str.++  "d" C "eddbcefafbaeefcffffd")  (str.++  "d" C "eddbcefaf" C "aeefcffffd") ))
(assert (= (str.++  "dbfdbfb" C "caeecfcd" C "ccedd")  (str.++  "dbfdbfb" C "caeecfcdbccedd") ))
(assert (= (str.++  C C C "debceeecac" C "daeeaaeb")  (str.++  "b" C C "de" C "ceeecac" C "daeeaae" C) ))
(assert (= (str.++  "fefef" C "aafdbdceaedfdece")  (str.++  "fefefbaafd" C "dceaedfdece") ))
(assert (= (str.++  "edaffed" C C "daaeceeaafaac")  (str.++  "edaffed" C C "daaeceeaafaac") ))
(assert (= (str.++  "c" C "eafaaacce" C "cdf" C "ebbbcc")  (str.++  "cbeafaaaccebcdfbeb" C "bcc") ))
(assert (= (str.++  C "aeaadbbafaffcbdfeb" C "de")  (str.++  C "aeaadb" C "afaffc" C "dfe" C C "de") ))
(assert (= (str.++  "eca" C "dfcea" C "dacacefbeadf")  (str.++  "ecabdfceabdacacefbeadf" "") ))
(assert (= (str.++  "adbcddd" C "ceacfaeccadcbe")  (str.++  "ad" C "cdddbceacfaeccadc" C "e") ))
(assert (= (str.++  "acafa" C "fedfdeedecdf" C "c" C "f")  (str.++  "acafabfedfdeedecdf" C "cbf") ))
(assert (= (str.++  "beafebecddadabaaddbddb" "")  (str.++  C "eafe" C "ecddadabaadd" C "ddb") ))
(assert (= (str.++  "edfaeeefcaceacfeaf" C "acc")  (str.++  "edfaeeefcaceacfeafbacc" "") ))
(assert (= (str.++  "bbceadfbeee" C "adeccccd" C "f")  (str.++  "b" C "ceadfbeeebadeccccdbf") ))
(assert (= (str.++  "ffeee" C "dde" C "feaec" C "cafff" C)  (str.++  "ffeeebddebfeaec" C "cafff" C) ))
(assert (= (str.++  C "daa" C "cffdbf" C "ffbbeffbed")  (str.++  C "daa" C "cffdbfbffbbeff" C "ed") ))
(assert (= (str.++  C "eaeccd" C C "ffbdcdacafddd")  (str.++  C "eaeccd" C C "ff" C "dcdacafddd") ))
(assert (= (str.++  "dcadecdf" C C "ed" C "a" C C "ccbedc")  (str.++  "dcadecdfb" C "edbabbcc" C "edc") ))
(assert (= (str.++  "ffaadcbbdaddeddffdfeca" "")  (str.++  "ffaadc" C C "daddeddffdfeca") ))
(assert (= (str.++  "adeaacad" C "efea" C "c" C "ebddfd")  (str.++  "adeaacadbefeabc" C "e" C "ddfd") ))
(assert (= (str.++  "cb" C "fbacd" C "ffae" C "ccaeffea")  (str.++  "cb" C "f" C "acdbffaebccaeffea") ))
(assert (= (str.++  "afaccdfd" C "eadfcafec" C "aec")  (str.++  "afaccdfdbeadfcafec" C "aec") ))
(assert (= (str.++  "dceebeeacdcdfedf" C C "cdcd")  (str.++  "dcee" C "eeacdcdfedf" C "bcdcd") ))
(assert (= (str.++  "aeecdeaadfc" C "fccdf" C "edfc")  (str.++  "aeecdeaadfc" C "fccdfbedfc") ))
(assert (= (str.++  "ccccef" C "aeccbcdca" C "cdefc")  (str.++  "ccccef" C "aeccbcdcabcdefc") ))
(assert (= (str.++  "dbddb" C "aceccfea" C "efacbcc")  (str.++  "dbdd" C "baceccfea" C "efacbcc") ))
(assert (= (str.++  "eaecdeaf" C "dcfceadcaadea")  (str.++  "eaecdeafbdcfceadcaadea" "") ))
(assert (= (str.++  "ceacdefffdef" C "faaddbeff")  (str.++  "ceacdefffdefbfaadd" C "eff") ))
(assert (= (str.++  "bcd" C "a" C "bcecdebfacddcaad")  (str.++  C "cd" C "a" C C "cecdebfacddcaad") ))
(assert (= (str.++  "cbdeaabadfccdecef" C "fdaa")  (str.++  "c" C "deaa" C "adfccdecefbfdaa") ))
(assert (= (str.++  "eeeff" C "eaaaaabcedeebfba")  (str.++  "eeeff" C "eaaaaabcedeebfba") ))
(assert (= (str.++  "acdeddbacb" C "f" C "cfbafdcda")  (str.++  "acdedd" C "ac" C "bfbcfbafdcda") ))
(assert (= (str.++  "dadcadcfebfcecce" C "fbadf")  (str.++  "dadcadcfebfceccebf" C "adf") ))
(assert (= (str.++  "dccdfabaeeecaefc" C "baeea")  (str.++  "dccdfa" C "aeeecaefc" C "baeea") ))
(assert (= (str.++  C "eeccfdefcf" C "fababdfafa")  (str.++  C "eeccfdefcf" C "fa" C "a" C "dfafa") ))
(assert (= (str.++  "cbfcb" C C "fa" C "e" C "beadfdd" C "da")  (str.++  "c" C "fc" C C C "fa" C "ebbeadfddbda") ))
(assert (= (str.++  "ccc" C "faefaddecfdfcaedee")  (str.++  "ccc" C "faefaddecfdfcaedee") ))
(assert (= (str.++  "eaa" C "da" C "b" C "ceceecaedecca")  (str.++  "eaa" C "da" C C "bceceecaedecca") ))
(assert (= (str.++  "fa" C "cebfecdcaaf" C "eccbfac")  (str.++  "fa" C "ce" C "fecdcaafbeccbfac") ))
(assert (= (str.++  "eecdacefbcaef" C C "fadcbd" C)  (str.++  "eecdacef" C "caef" C C "fadcbd" C) ))
(assert (= (str.++  "cdaadf" C "a" C "ad" C "acdeefdddd")  (str.++  "cdaadfba" C "adbacdeefdddd") ))
(assert (= (str.++  "e" C "fefcbdadcaaeed" C "ceccd")  (str.++  "ebfefcbdadcaaeed" C "ceccd") ))
(assert (= (str.++  C "fee" C "bacd" C "eafcdffcbece")  (str.++  "bfee" C C "acdbeafcdffc" C "ece") ))
(assert (= (str.++  C "ffcef" C "fcfbdafbbfddecd")  (str.++  C "ffcef" C "fcf" C "daf" C C "fddecd") ))
(check-sat)

(exit)

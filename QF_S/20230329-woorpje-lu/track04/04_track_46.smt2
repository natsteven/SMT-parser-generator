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

(declare-fun H () String)
(declare-fun B () String)
(declare-fun F () String)
(declare-fun A () String)
(declare-fun C () String)
(assert (= (str.++  "abdabbadd" C "abdc" B "cadaadccadcab")  (str.++  "abdabbaddbdadddcbbdd" F "cdbdbdcbaadcaccbacabababddbbacadaadccadcab") ))
(assert (= (str.++  "bbdcadddcbbcb" H "ccbbdbacbbbdcbddbccadadccbadbcdadbdaabbcbcdcbdcbcdcdcdaddabcca")  (str.++  "bbdcadddcbbcb" H "ccbbdbacbbbdcbddbccadadccbadbcdadbdaabbcbcdcbdcbcdcdcdaddabcca") ))
(assert (= (str.++  "daacbcabdabcbcbccccdcdabcac" H "adbbdccbdcbaadcaddcaccaddaddadbcdbadbccaabccdabb")  (str.++  "daacbcabdabcbcbccccdcdabcac" H "adbbdccbdcbaadcaddcaccaddaddadbcdbadbccaabccdabb") ))
(assert (= (str.++  "bdbadcadbabbdaabdccdbcdcccaababbcbbdbdadaccbbcccaadbdbddcabaacccadabdbdcbddcbabcc" "")  (str.++  "bdbadcadbabbdaabdccdbcdcccaababbcbbdbdadaccbbcccaadbdbddcabaacc" H "bdcbddcbabcc") ))
(assert (= (str.++  "ddadabcdddaaddababbcdcdbcaddbcbcdbdbdabddaddaacbaabbaaacdacbbacdccadabdccdabbbdbc" "")  (str.++  "ddadabcdddaaddababbcdcdbcaddbcbcdbdbdabddaddaacbaabbaaacdacbbacdc" H "ccdabbbdbc") ))
(assert (= (str.++  "bbcddccddddbbdbadaccabadbcccddacbbbddcbaacadabdbbccccaaccbdaddbaaabcdccaaaddbccad" "")  (str.++  "bbcddccddddbbdbadaccabadbcccddacbbbddcbaa" H "bbccccaaccbdaddbaaabcdccaaaddbccad") ))
(assert (= (str.++  "cddbacaacbcccadbd" H "adcabddbcacaaaadbcdbddbaaabaaacadacbdcacbdacbdcaacdcbdcccb")  (str.++  "cddbacaacbcccadbdcadabdadcabddbcacaaaadbcdbddbaaabaaacadacbdcacbdacbdcaacdcbdcccb" "") ))
(assert (= (str.++  "caabdbabdbdabddddbcdcbbdbdccdddaacdadbacaadabbbadbbdabcadb" H "ddbbcccdaaabccccc")  (str.++  "caabdbabdbdabddddbcdcbbdbdccdddaacdadbacaadabbbadbbdabcadb" H "ddbbcccdaaabccccc") ))
(assert (= (str.++  "daacadabdacddbcdbccbddcbababccaddddbbbacdbbbbbcbbdcbabadacdabcaccadbcaccdbbdbcbcd" "")  (str.++  "daa" H "acddbcdbccbddcbababccaddddbbbacdbbbbbcbbdcbabadacdabcaccadbcaccdbbdbcbcd") ))
(assert (= (str.++  "adcacddbbaddddadaaacdcadcddbbaaddbabbaacdddadddaccbaddba" H "acdabbaacdacabcadba")  (str.++  "adcacddbbaddddadaaacdcadcddbbaaddbabbaacdddadddaccbaddbacadabdacdabbaacdacabcadba" "") ))
(assert (= (str.++  "cdbbcacbdacbcdbadcbccabbbddd" H "cdcbbabccdbaadbccdbdbbbbcaadadbcaacbcadbddaaccd")  (str.++  "cdbbcacbdacbcdbadcbccabbbddd" H "cdcbbabccdbaadbccdbdbbbbcaadadbcaacbcadbddaaccd") ))
(assert (= (str.++  "bcdaaaadabaadadbbbccdccddddbcddbdbbdabbdbbdcbadbbdbadcabcabacdbad" H "ccdbabacca")  (str.++  "bcdaaaadabaadadbbbccdccddddbcddbdbbdabbdbbdcbadbbdbadcabcabacdbadcadabdccdbabacca" "") ))
(assert (= (str.++  "adaddabcbddbdcbddcadcadabdcddcbbcaaddabbdadaaaccdbcbaabbdaaaadcdcbcabcdbacadaacdd" "")  (str.++  "adaddabcbddbdcbddcad" H "cddcbbcaaddabbdadaaaccdbcbaabbdaaaadcdcbcabcdbacadaacdd") ))
(assert (= (str.++  "bccdcabccabbbcaadbda" H "abcbadcbdcbabbdadccadddbdddabbdcbbadbbcbcadcdbbcdbcdadc")  (str.++  "bccdcabccabbbcaadbda" H "abcbadcbdcbabbdadccadddbdddabbdcbbadbbcbcadcdbbcdbcdadc") ))
(assert (= (str.++  "aa" B "dcaacbaddabcc" H "dbdaacadbabacad" H "c")  (str.++  "aa" H "acccbbabcbbaaaaccacbddbcdd" H "dcd" H "aaaadacdadb" H "aacbaddabccdcdbdaacadbabacad" H "c") ))
(assert (= (str.++  "bbd" H "ccaaddaccabdcbbcc" H "dcacaadaaababcccbcabdddcdb" H "da" H "bdddabaadbcabbcdaaacbbdba")  (str.++  "bbddcccaaddaccab" H "bbccdcdcacaadaaababcccbcabdd" H "db" H "da" H "bdddabaadbcabbcdaaacbbdba") ))
(assert (= (str.++  "dcbacddaabbbbcdabdcddccacabcaddaccacbdbcdad" H "bdccd" A "ccbaadcc" H "bd" H "dcacadaccbbbc")  (str.++  H "bacddaabbbbcdab" H "d" H "cacabcaddaccacbdbcdaddcb" H "cd" A "ccbaa" H "c" H "bddcdcacadaccbbbc") ))
(assert (= (str.++  "bcbababccababccadbddaa" A H "bacdddabddd" H "ccbaddaddddabdbdcdddcdabaaadd" H "ccdacbb" H)  (str.++  "bcbababccababccadbddaa" A "dcbacdddabddd" H "ccbaddaddddabdbdcdddcdabaaadddcccdacbb" H) ))
(assert (= (str.++  "adccccabbaa" H "aaddab" H "ccccdaacacaabdaaaab" H "cacbccdd" H "cddcdaaccbaacdcabbccdbaaccddc")  (str.++  "adccccabbaa" H "aaddabdcccccdaacacaabdaaaabdccacbccdddccddcdaaccbaacdcabbccdbaaccddc") ))
(assert (= (str.++  "cdbbbadadaccaadadcccbcdbb" H "bdcd" H "ddadadbdcb" H "cbcbaaacaabbcabdbcbaaabcaaaabab" H "bda")  (str.++  "cdbbbadadaccaada" H "ccbcdbb" H "bdcddcddadadb" H "bdccbcbaaacaabbcabdbcbaaabcaaaababdcbda") ))
(assert (= (str.++  "bdcddbbbacccddbabbcbdbaccbdcbbbc" H "baddddbccadacadbabcbdddddccc" H "daaddadbccdaaaccb")  (str.++  "b" H "ddbbbacccddbabbcbdbaccb" H "bbbcdcbaddddbccadacadbabcbdddd" H "cc" H "daaddadbccdaaaccb") ))
(assert (= (str.++  "abc" H "adbccabdbbbaccdcbacbbcccaaabaabbabcaacccaadcdddcc" H "dcddacaaaccabcdcccc" H "bcbc")  (str.++  "abcdcadbccabdbbbacc" H "bacbbcccaaabaabbabcaacccaadcdd" H "c" H H "ddacaaaccabcdccccdcbcbc") ))
(assert (= (str.++  "abdaccdacacbaccaadbbd" H "dadabccdbaaccdabaadbbdcbadbdaabcadbacdcccbcbc" H "cadbcccbb" H)  (str.++  "abdaccdacacbaccaadbbd" H "dadabccdbaaccdabaadbb" H "badbdaabcadbacdcccbcbcdccadbcccbbdc") ))
(assert (= (str.++  "aaacbabcadcb" H "bcbbaccdbb" H "bcb" H "abbdacabbdbcacbbadddabbcacad" H "bd" H "cbbcccdadabbdbab")  (str.++  "aaacbabca" H "b" H "bcbbaccdbb" H "bcbdcabbdacabbdbcacbbadddabbcacaddcbd" H "cbbcccdadabbdbab") ))
(assert (= (str.++  "bdddbdabcadddbcbddcacdaadaaac" H "cdabbbbbbdaddcabbbbbbabbacbbcdaccddddbd" H "ddcbbaadb")  (str.++  "bdddbdabcadddbcbd" H "acdaadaaac" H "cdabbbbbbdaddcabbbbbbabbacbbcdaccddddbddcd" H "bbaadb") ))
(assert (= (str.++  "acadabccaccdacccabcbdabbdabcaaaadbcccdbabadabbacdbcaabbbdbbaddbbdacdbcabab" H "addaa")  (str.++  "acadabccaccdacccabcbdabbdabcaaaadbcccdbabadabbacdbcaabbbdbbaddbbdacdbcababdcaddaa" "") ))
(assert (= (str.++  "aabadcccbccdddacddbaabbdbdddabbc" H "bbdadbbabbabadcbc" H "cb" H "bbaacccdbcaabdbabaabacad")  (str.++  "aabadcccbccdddacddbaabbdbdddabbc" H "bbdadbbabbaba" H "bcdccbdcbbaacccdbcaabdbabaabacad") ))
(assert (= (str.++  "bdbbaccbaccddacdbbcbdbabacbabbabcbcddbacabcdbdbddbabadcddbbcbcbacdcababbaacbaccad" "")  (str.++  "bdbbaccbaccddacdbbcbdbabacbabbabcbcddbacabcdbdbddbabadcddbbcbcbac" H "ababbaacbaccad") ))
(assert (= (str.++  "dbbbbdbdbbddbabcbdabbdcdadabcccabccabbbaaadddbadabacdabcbccdcbaabdcdacdbdcdd" H "cad")  (str.++  "dbbbbdbdbbddbabcbdabb" H "dadabcccabccabbbaaadddbadabacdabcbccdcbaab" H "dacdb" H "dddccad") ))
(assert (= (str.++  "dbbccbcabdcababdddabcdacbdbaacbaaabddaccccbcbac" H "aadacdcdabad" H "adbabbccddbdbcaadd")  (str.++  "dbbccbcab" H "ababdddabcdacbdbaacbaaabddaccccbcbac" H "aadacdcdabaddcadbabbccddbdbcaadd") ))
(assert (= (str.++  "bbbbdabcaab" H "b" H "dcbacdcdbdacccaccadbcccacacccabddbbbcacdbcbdcbcabaaddbcbcbccacdcd")  (str.++  "bbbbdabcaabdcbdc" H "bac" H "dbdacccaccadbcccacacccabddbbbcacdbcb" H "bcabaaddbcbcbccacdcd") ))
(assert (= (str.++  "ccda" H "cccccdbdaa" H "c" H "bbcddccdbaabdacccdbaabaccddbacbbdddbdcadadddabcbbbaba" H "cdbcd")  (str.++  "ccda" H "cccccdbdaadcc" H "bbcd" H "cdbaabdacccdbaabaccddbacbbdddb" H "adadddabcbbbaba" H "cdbcd") ))
(assert (= (str.++  "dcabcbcdd" H "bdbadccacb" H "ccbacdabacda" H "bdccdacadbdabbddabcabbacaabdacccacadbddacdac")  (str.++  "dcabcbcdddcbdba" H "cacb" H "ccbacdabacdadcbdccdacadbdabbddabcabbacaabdacccacadbddacdac") ))
(assert (= (str.++  H "bbbaadabbbabcd" H "abacccaddddbcadaaabaaddbcbddcdbbdcadbbddadbbadabcdbdbbabdbdaadd")  (str.++  "dcbbbaadabbbabcddcabacccaddddbcadaaabaaddbcbd" H "dbb" H "adbbddadbbadabcdbdbbabdbdaadd") ))
(assert (= (str.++  "bcdacabbacdc" H "baccdccdabacbaad" H "ababcaacaadabbacca" H "cbbcbbcbbcccbadaccccddbcdaaca")  (str.++  "bcdacabbac" H H "baccdccdabacbaaddcababcaacaadabbacca" H "cbbcbbcbbcccbadaccccddbcdaaca") ))
(assert (= (str.++  "cadd" H "dbbbbacdbadcdababcddaabadbddacbddbbaaababcccbbaacbddbbcccddbaacbdaddbbdddaa")  (str.++  "cadd" H "dbbbbacdbadcdababcddaabadbddacbddbbaaababcccbbaacbddbbcccddbaacbdaddbbdddaa") ))
(assert (= (str.++  "cdbbbbcaccbbbdbadcbcdbcd" H "dcababddabbbaaadcaaabdcbcadcddbbcccababacccdadddacdaacc")  (str.++  "cdbbbbcaccbbbdbadcbcdbcd" H H "ababddabbbaaa" H "aaab" H "bcadcddbbcccababacccdadddacdaacc") ))
(assert (= (str.++  "cdbcaababdacdbacbc" H "ababacadadccdccadbbddbaa" H "abdbdadbabcbbabababcbbcadabddabccad")  (str.++  "cdbcaababdacdbacbc" H "ababacada" H "cdccadbbddbaadcabdbdadbabcbbabababcbbcadabddabccad") ))
(assert (= (str.++  "caabdccbbadccdcddad" H "dadaacbbdabbadbccbdaaacdabbaaaabdbccacaacbbabcdccbdbabbbaabb")  (str.++  "caab" H "cbba" H "c" H "ddad" H "dadaacbbdabbadbccbdaaacdabbaaaabdbccacaacbbabcdccbdbabbbaabb") ))
(assert (= (str.++  "abaaacbbaaadbada" H "dbadbcabaabcacccbbbdacdcdadcdbcbdbbbddabbbcccbadbaabacacbdacaad")  (str.++  "abaaacbbaaadbada" H "dbadbcabaabcacccbbbdac" H "dadcdbcbdbbbddabbbcccbadbaabacacbdacaad") ))
(assert (= (str.++  "ddddbbadadabbdaadcccadddbcbbcbbccbbbbacbccdbcbccdaccacbaabd" H "d" H "dcacbcbdbccccdcbb")  (str.++  "ddddbbadadabbdaadcccadddbcbbcbbccbbbbacbccdbcbccdaccacbaabd" H "ddc" H "acbcbdbcccc" H "bb") ))
(assert (= (str.++  "dbabcadaabdcdacbaabbadbcdcacdacdccdbcdcbdb" H "caabccaadcccddd" H "cbdbaddacabbbabc" H "bc")  (str.++  "dbabcadaabdcdacbaabbadbc" H "acdac" H "cdbcdcbdb" H "caabccaadcccddddccbdbaddacabbbabcdcbc") ))
(assert (= (str.++  H "a" H "aacabdbddbbbabdaacddcadabbcadbbccdbacbbbacdbbcacddcccdbbbcacbcdaccadaacaccbd")  (str.++  "dcadcaacabdbddbbbabdaacddcadabbcadbbccdbacbbbacdbbcacddcccdbbbcacbcdaccadaacaccbd" "") ))
(assert (= (str.++  "cbbaccacbbacccc" H "cbbaadccbbbaabadbcdbcdadbaadacaccbabcbdababb" A "ccabdbcadadbbacc")  (str.++  "cbbaccacbbacccc" H "cbbaa" H "cbbbaabadbcdbcdadbaadacaccbabcbdababba" H "accabdbcadadbbacc") ))
(assert (= (str.++  "aaadcbbbadbdadadddaaacbaacdbcbacad" H "dabbbaccbacbabbbacbdacdbbaadaacabacbddddcdcba")  (str.++  "aaa" H "bbbadbdadadddaaacbaacdbcbacad" H "dabbbaccbacbabbbacbdacdbbaadaacabacbddd" H H "ba") ))
(assert (= (str.++  "cabcc" A "cbdddcbbadddbbacbcaccbabda" H "cdb" H "acadadaaaadbccddbabcadcbabadbbacdcdbcbd")  (str.++  "cabcca" H "acbdd" H "bbadddbbacbcaccbabdadccdb" H "acadadaaaadbccddbabca" H "babadbbacdcdbcbd") ))
(assert (= (str.++  "cc" H "ccdbbcdabbbb" H "addbdababbbadddbcdcddacdadbbbcbcddcbdadadaddcacccdaba" H "bcbaabdc")  (str.++  "ccdcccdbbcdabbbb" H "addbdababbbadddbcdcddacdadbbbcbcd" H "bdadadad" H "acccdaba" H "bcbaabdc") ))
(assert (= (str.++  "bddaadbd" A "dbbdabcddbcbdcbadddbc" A "cbcadcdbaccbccbaaddbb" H "acabbbccaacddbadbacdb")  (str.++  "bddaadbda" H "adbbdabcddbcb" H "badddbca" H "acbca" H "dbaccbccbaaddbbdcacabbbccaacddbadbacdb") ))
(assert (= (str.++  "ad" A "dabb" H "adabacccbddbddddabc" H "dcbcaaaacadcdbdbdbacdcdabbcddaabdacbcbdbbdacdbab")  (str.++  "ada" H "adabbdcadabacccbddbddddabcdc" H "bcaaaacadcdbdbdbac" H "dabbcddaabdacbcbdbbdacdbab") ))
(assert (= (str.++  "acccddbacabadaabcbdcdacbdddbccaacaacbbcdbdcaacaabddbcadadaaaaabcdbaacbddadacbd" H "b")  (str.++  "acccddbacabadaabcb" H "dacbdddbccaacaacbbcdbdcaacaabddbcadadaaaaabcdbaacbddadacbddcb") ))
(assert (= (str.++  "acb" H "aaccdcccbaabbabcbcaccdaccacddaaabb" H "bdbacabaccbdbbaacdbddbcabbcccbcbcddcbbcd")  (str.++  "acbdcaaccdcccbaabbabcbcaccdaccacddaaabb" H "bdbacabaccbdbbaacdbddbcabbcccbcbcddcbbcd") ))
(assert (= (str.++  "babbbcdc" H "bddaccacbbcdbaaadccdddbadbddd" H "cbbdcccbdaabbabcacdbadbcaabdaccccaacbbbd")  (str.++  "babbbcdc" H "bddaccacbbcdbaaadccdddbadbddd" H "cbb" H "ccbdaabbabcacdbadbcaabdaccccaacbbbd") ))
(assert (= (str.++  "dccbccacadddabcaaddcccabbbccdbdccabdadaddaababcaadaadaccbacbdbcccdadddcccbdbbbdda" "")  (str.++  H "cbccacadddabcaaddcccabbbccdbdccabdadaddaababcaadaadaccbacbdbcccdadd" H "ccbdbbbdda") ))
(assert (= (str.++  "bbcbdbbaaacacdcdabccbddbddcbcdacbacccbbabbcaba" H "bdadbacdadadbcb" H "dbadacbadbbbddaa")  (str.++  "bbcbdbbaaacac" H "dabccbddbd" H "bcdacbacccbbabbcabadcbdadbacdadadbcb" H "dbadacbadbbbddaa") ))
(assert (= (str.++  "aaabaadbabdddbacdccccbbcbdcaabaddcaabbddbd" H "cabb" H "bcbdaccabbddacdbacacbdadcbcbacd")  (str.++  "aaabaadbabdddbacdccccbbcb" H "aabaddcaabbddbddccabb" H "bcbdaccabbddacdbacacbda" H "bcbacd") ))
(assert (= (str.++  "c" H "babcbabbcbdcaddacbbbdd" H "abbbcbcabdbddda" H "ddacaaaddabcacbcbdaadabadbaadcbcaccbd")  (str.++  "c" H "babcbabbcb" H "addacbbbdd" H "abbbcbcabdbdddadcddacaaaddabcacbcbdaadabadbaadcbcaccbd") ))
(assert (= (str.++  "cd" H "abddaddbddddbddaaadc" H "bcd" H "adddc" H "dcbaadbcbd" H "acddbddabbadbbccdaba" H "cabadbcaa")  (str.++  "cddcabddaddbddddbddaaadc" H "bcd" H "add" H "dcdcbaadbcbddcacddbddabbadbbccdabadccabadbcaa") ))
(assert (= (str.++  "ddddbcdbddbdadcbc" A "abccadbbabdbadba" H "baadbb" H "aabdbaadabbcc" H "acaadd" H "cbcbccaabcd")  (str.++  "ddddbcdbddbdadcbc" A "abccadbbabdbadba" H "baadbbdcaabdbaadabbccdcacaadd" H "cbcbccaabcd") ))
(assert (= (str.++  "abdca" H "cdcadbbaadacaacacdcacddbacddbdabccccbbbddbcccabadabbabadaaccdbbabdbcccbdac")  (str.++  "abdcadcc" H "adbbaadacaacac" H "acddbacddbdabccccbbbddbcccabadabbabadaaccdbbabdbcccbdac") ))
(assert (= (str.++  "dbcdbcdadacbabcbacacbbaaaacbbcbdbcacdbbcbbcbcdbdabddbc" H "cbdbcdb" A "cacb" H "dbdaaadd")  (str.++  "dbcdbcdadacbabcbacacbbaaaacbbcbdbcacdbbcbbcbcdbdabddbc" H "cbdbcdb" A "cacbdcdbdaaadd") ))
(assert (= (str.++  "aabcacbaad" H "acbbdcabcbaaabbb" H "cbcbcdaccacbacccbbbcabcbbcdbbbbcbbcddbbbdddcabacc" H)  (str.++  "aabcacbaaddcacbbdcabcbaaabbb" H "cbcbcdaccacbacccbbbcabcbbcdbbbbcbbcddbbbdd" H "abaccdc") ))
(assert (= (str.++  "bbdcabbcad" H "bcc" H "dadcdddabbdabdabacb" H "dacaaddcbdcdbddccdacbbbdcbdbbcbcdaadaddbdba")  (str.++  "bb" H "abbcaddcbcc" H "da" H "dddabbdabdabacbdcdacaaddcbdcdbd" H "cdacbbbdcbdbbcbcdaadaddbdba") ))
(assert (= (str.++  "bbbcbcadbcb" H "addacacbcddaadbdccdbddadadccacccdbaacccabbadabbdcbcdccddcabbc" A "cdd")  (str.++  "bbbcbcadbcbdcaddacacbcddaadb" H "cdbddada" H "cacccdbaacccabbadabb" H "bc" H "cddcabbcadcacdd") ))
(assert (= (str.++  "babaccbbcdbacbcbabdadbaaaaddddabccdbcdabcbbaccbacddbcdbacaccbcd" H "cccadbddcadbacba")  (str.++  "babaccbbcdbacbcbabdadbaaaaddddabccdbcdabcbbaccbacddbcdbacaccbcddccccadbd" H "adbacba") ))
(assert (= (str.++  H "caabbdcbcbcccbdcabadccbdddcabb" H "baacbabaadbdabdabdcacdacabd" H "c" H "bbcabbcbbdcabba")  (str.++  H "caabbdcbcbcccb" H "abadccbdd" H "abbdcbaacbabaadbdabdab" H "acdacabd" H "cdcbbcabbcbbdcabba") ))
(assert (= (str.++  "ccdbbbddabbbcaabbaccab" H "cdcabbacaccdbbddadadccbbbadcadbbab" H "bdacdbdaacdddadaadaca")  (str.++  "ccdbbbddabbbcaabbaccab" H "cdcabbacaccdbbddada" H "cbbba" H "adbbabdcbdacdbdaacdddadaadaca") ))
(assert (= (str.++  "cbccbcaccccdbdacdabcabacdcacbabbaddcbcdbbaddadbbbc" H "dbdcacbcddbccbbcd" H "dddabbbbca")  (str.++  "cbccbcaccccdbdacdabcabacdcacbabbad" H "bcdbbaddadbbbc" H "dbdcacbcddbccbbcddcdddabbbbca") ))
(assert (= (str.++  "cbdbccbaadcdcbbabcadd" H "dacbabdadaacccccdcbcaaccddbcbcdaacd" H "cadbbcadabadbb" H "aaaca")  (str.++  "cbdbccbaadc" H "bbabcadddcdacbabdadaacccccdcbcaaccddbcbcdaacd" H "cadbbcadabadbbdcaaaca") ))
(assert (= (str.++  "cbdbccbbbccaacddbddbbdaababbabaccbdcbcccdbdbcabbcb" H "aab" H "abcdacda" H "accdbdbaccccac")  (str.++  "cbdbccbbbccaacddbddbbdaababbabaccb" H "bcccdbdbcabbcb" H "aab" H "abcdacd" A "ccdbdbaccccac") ))
(assert (= (str.++  "dbccdadadaadbabccabccaadbbacabcccabdddaabacbdaccbabca" H "bcbacbdbaaabdcdbacdbbcbcbc")  (str.++  "dbccdadadaadbabccabccaadbbacabcccabdddaabacbdaccbabca" H "bcbacbdbaaab" H "dbacdbbcbcbc") ))
(assert (= (str.++  H "cbbbccabadbaaadbcdcccbbabacccdddabddaddbccaccdbcddb" H "a" H "caadddddcadcbdcdadbabba")  (str.++  "dccbbbccabadbaaadbc" H "ccbbabacccdddabddaddbccaccdbcddbdca" H "caadddd" H "a" H "b" H "dadbabba") ))
(assert (= (str.++  "ccaccdabaccbb" H "ddbaacbbcadacababdabb" H "dabacddabdcccabbcdbddcbbbbacbcad" H "dbcaaddcc")  (str.++  "ccaccdabaccbb" H "ddbaacbbcadacababdabbdcdabacddab" H "ccabbcdbd" H "bbbbacbcad" H "dbcaaddcc") ))
(assert (= (str.++  "adccacdbdbdbdababaddacbdcabdabbcabaacbdcbcdbdbccbbabdbdadacaadd" H "dcadcccbbab" H "adb")  (str.++  "adccacdbdbdbdababaddacbdcabdabbcabaacbdcbcdbdbccbbabdbdadacaadddc" H "adcccbbabdcadb") ))
(assert (= (str.++  "a" A "dbadccddacadcddaaaddcaccaca" H "bcabddbcdbacac" A "acaadcbbc" H "abbaddbcacdbbccdcd")  (str.++  "aadcadbadccddaca" H "ddaaaddcaccacadcbcabddbcdbacacadcaacaa" H "bbcdcabbaddbcacdbbccdcd") ))
(assert (= (str.++  "abaabaabdacaacbccabccbaacdbcbcbacdbcdacbadddbccbcb" H "dbbdbabddbaaaddbccdddcacccccc")  (str.++  "abaabaabdacaacbccabccbaacdbcbcbacdbcdacbadddbccbcb" H "dbbdbabddbaaaddbccdd" H "acccccc") ))
(assert (= (str.++  "dbabcabadadabdbddacacabdaccb" H "bbbccabdccccddbaddacabcdcbacdbcb" H "acdbac" H "dbabab" H "a")  (str.++  "dbabcabadadabdbddacacabdaccb" H "bbbccabdccccddbaddacabcdcbacdbcb" H "acdbacdcdbabab" H "a") ))
(assert (= (str.++  "aaabdcbdabbcccdacabbbacaaaddbadabcdbaaadbddbcbbbb" H "dbdaacbccaadbdaadcbddbbcaccadd")  (str.++  "aaab" H "bdabbcccdacabbbacaaaddbadabcdbaaadbddbcbbbb" H "dbdaacbccaadbdaadcbddbbcaccadd") ))
(assert (= (str.++  "cbbccbbcbcabccdaabdbcddbcadaabbdbadcdcddadabccacddbdacb" H "abcccccdddbbdda" H "ccdacdb")  (str.++  "cbbccbbcbcabccdaabdbcddbcadaabbdbadc" H "ddadabccacddbdacb" H "abcccccdddbbddadcccdacdb") ))
(assert (= (str.++  "caaabcdb" H "dbbccaccaddcdbaadaabdabbdabbbddabb" H "aabbcaaccabbbabbabdbbbcdbbddccaaacb")  (str.++  "caaabcdbdcdbbccaccad" H "dbaadaabdabbdabbbddabbdcaabbcaaccabbbabbabdbbbcdbbddccaaacb") ))
(assert (= (str.++  "bbcbdcbabcbccbabcbdbbcd" H "ccacdddbbabadbadabcabbdbbacbdddbdabdadacbaccdbbcdabbcabc")  (str.++  "bbcbdcbabcbccbabcbdbbcddcccacdddbbabadbadabcabbdbbacbdddbdabdadacbaccdbbcdabbcabc" "") ))
(assert (= (str.++  "dbabbabacaa" H "dabdbababcdbcacdbbaacbabbacbcbcdbbbcbcabbbd" H "ddbcdacdccdabab" H "acbadb")  (str.++  "dbabbabacaadcdabdbababcdbcacdbbaacbabbacbcbcdbbbcbcabbbddcddbcdac" H "cdababdcacbadb") ))
(assert (= (str.++  "bcbbbddcdaddacbcd" H H "dadacdcddccdacbccccbbbbdbdccdbdcdbabbbbacabbdbadad" H "dcbdbb" H)  (str.++  "bcbbbddcdaddacbcddcdcdadac" H "ddccdacbccccbbbbdbdccdbdcdbabbbbacabbdbadad" H "dcbdbb" H) ))
(assert (= (str.++  "bdacbabdb" H "adcadbdacbbdbdadddaadababdacdbddabacaddad" H "ccacdbccdccadddcc" H "badbcbdc")  (str.++  "bdacbabdbdc" A "dbdacbbdbdadddaadababdacdbddabacaddad" H "ccacdbcc" H "cadddccdcbadbcb" H) ))
(assert (= (str.++  "aaaacddbcbbdddabbcd" H H "bcdbbaccacbdabccdacaabcdaadcdcbabaabbdd" H "cdadbcbdaa" H "ccdda")  (str.++  "aaaacddbcbbdddabbcddc" H "bcdbbaccacbdabccdacaabcdaa" H H "babaabbdddccdadbcbdaadcccdda") ))
(assert (= (str.++  "daadabdacaaabacdcbacacdaaccdadaaadaabcbabdadabcdddcabbccdaab" H "abbbdbbcaacadbdcdcd")  (str.++  "daadabdacaaabacdcbacacdaaccdadaaadaabcbabdadabcdd" H "abbccdaabdcabbbdbbcaacadb" H H "d") ))
(assert (= (str.++  "daadbcbbbddbaddadbadbbaabbcccbc" H "bcbcdabaabaccbadbbccbadaaacdcadaadcdabdbccadacbc")  (str.++  "daadbcbbbddbaddadbadbbaabbcccbcdcbcbcdabaabaccbadbbccbadaaac" H "adaa" H "dabdbccadacbc") ))
(assert (= (str.++  "badbccdcabdbddcbdaacbcdaacaaccbdadcbdcadccdabbcacdbacbaddbabcdccabddcdca" H "adaddab")  (str.++  "badbcc" H "abdbddcbdaacbcdaacaaccbda" H "b" H "adccdabbcacdbacbaddbabcdccabddc" H "a" H "adaddab") ))
(assert (= (str.++  "addddbacbbbad" H "ddaabbbdbb" H "b" H "dab" H "aadaaaca" H "cdc" H "bcdddcccabadaccabbcdddaaabbcadb")  (str.++  "addddbacbbbaddcddaabbbdbb" H "bdcdab" H "aadaaaca" H "c" H H "bcdddcccabadaccabbcdddaaabbcadb") ))
(assert (= (str.++  "abcdda" H "bcadabbbdbcbcbcdbcbbbabaccbcacadbcbaadcabb" H "dacb" H "babdaa" H "dbddcbbcacaaabb")  (str.++  "abcddadcbcadabbbdbcbcbcdbcbbbabaccbcacadbcbaa" H "abb" H "dacbdcbabdaa" H "dbddcbbcacaaabb") ))
(assert (= (str.++  "acbaaabbcacacbad" H "abcddbbbbdddbbaacdacdbad" H "dddbcddbbaadaadabacadadadacddbccaadba")  (str.++  "acbaaabbcacacbad" H "abcddbbbbdddbbaacdacdbaddcdddbcddbbaadaadabacadadadacddbccaadba") ))
(assert (= (str.++  "ddacdaddaabddccabbbcaccbcababcadbb" H "dacadccdbbbdbbddbcadabbcadbdddaabdbadabcbbdbd")  (str.++  "ddacdaddaabddccabbbcaccbcababcadbb" H "dacadccdbbbdbbddbcadabbcadbdddaabdbadabcbbdbd") ))
(assert (= (str.++  H "cbbbbdbaabbaacdccdbdcdcbdccbcdddddcdad" H "ccdaabcdbdbddab" H H "abdc" H "cacdacadbdacad")  (str.++  H "cbbbbdbaabbaac" H "cdb" H H "b" H "cbcdddd" H "daddcccdaabcdbdbddab" H "dcabdcdccacdacadbdacad") ))
(assert (= (str.++  "cdbcacababdbdcdaccbcbbddaacdcaddad" H "cbaadbddabacadcddacdbcdc" H "bddabaacccbabacbcac")  (str.++  "cdbcacababdb" H "daccbcbbddaacdcaddaddccbaadbddabaca" H "ddacdbc" H H "bddabaacccbabacbcac") ))
(assert (= (str.++  "baabc" H "cbacaacdbddbabaadacbcaabacbdacacbbabbcdbaabbddba" H "cccccdddddcbcdacbddacdab")  (str.++  "baabc" H "cbacaacdbddbabaadacbcaabacbdacacbbabbcdbaabbddba" H "cccccdddd" H "bcdacbddacdab") ))
(assert (= (str.++  "cbcddbdddd" H "bbbbaabdacacdabbcaaaacbdbddabdcbdccccaa" H "cb" H "adbbabcacadaaadbadbcadbb")  (str.++  "cbcddbdddd" H "bbbbaabdacacdabbcaaaacbdbddab" H "bdccccaadccbdcadbbabcacadaaadbadbcadbb") ))
(assert (= (str.++  "caabddbaaccb" H "dacbbbdbbcaacdcdddaddcacabcbacbccabbacccaaaabada" H H "db" H H "cbdddaccb")  (str.++  "caabddbaaccb" H "dacbbbdbbcaacdcdddaddcacabcbacbccabbacccaaaabada" H H "dbdc" H "cbdddaccb") ))
(assert (= (str.++  "bcaabcbaaabbccbddadddccad" A "ccccdbbbccacbbbac" H "bcbcdbddcacbacdadcddbbcdbabddbabb")  (str.++  "bcaabcbaaabbccbddadd" H "cad" A "ccccdbbbccacbbbacdcbcbcdbddcacbacda" H "ddbbcdbabddbabb") ))
(assert (= (str.++  "aadbacabdbaddbaacbacbabdabcbcca" H "cdddabbb" H "aacddcddddadbcdc" H "baddabcadbcacddcdaca")  (str.++  "aadbacabdbaddbaacbacbabdabcbccadccdddabbbdcaacd" H "ddddadbc" H "dcbaddabcadbcacd" H "daca") ))
(assert (= (str.++  "cbcbbacdccbcdbbaacbadacccadacadacbcadadbcbabcabdbabcdbacaaaaccc" H "cdbdbc" H "bccadacc")  (str.++  "cbcbbacdccbcdbbaacbadacccadacadacbcadadbcbabcabdbabcdbacaaaacccdccdbdbcdcbccadacc" "") ))
(assert (= (str.++  "cadddbccbbdbcdabdadbcaadadbbcddaadabccacbaccccaaaaaacba" H "b" H "ababbab" H "daab" H "abdada")  (str.++  "cadddbccbbdbcdabdadbcaadadbbcddaadabccacbaccccaaaaaacbadcb" H "ababbab" H "daab" H "abdada") ))
(assert (= (str.++  "dadadabbdabcadbcdcaadcccccdcccdccbddbcdbaac" H "b" H "cbabcbcadaabdacbddbdadabbdbcbadaa")  (str.++  "dadadabbdabcadbcdcaa" H "ccccdcccdccbddbcdbaac" H "b" H "cbabcbcadaabdacbddbdadabbdbcbadaa") ))
(assert (= (str.++  "ac" H "bbaadadd" H "bbdaaabd" H "cbddbcdcccdbaccdbccadbbcbbcddacacdabac" H "caacdddbbbbccadab")  (str.++  "acdcbbaadadddcbbdaaabd" H "cbddbc" H "ccdbaccdbccadbbcbbcddacacdabacdccaacdddbbbbccadab") ))
(assert (= (str.++  "ddc" H "dabddcbaadddbbdbcdbcdd" H "adacbcccdaccaccdbbbaddddaddabdcdbdbcdbccccbcddbbacad")  (str.++  "ddcdcdabddcbaadddbbdbcdbcdddcadacbcccdaccaccdbbbaddddaddabdcdbdbcdbccccbcddbbacad" "") ))
(assert (= (str.++  "dbbccabcdcbbacbbbcbcccbacbbdaccdbaacdcadcbcaccddabddaccacbdaabaddcbba" A "cacbabbb")  (str.++  "dbbccabc" H "bbacbbbcbcccbacbbdaccdbaac" H "a" H "bcaccddabddaccacbdaabaddcbbaadcacacbabbb") ))
(assert (= (str.++  "caaacccdbccbdbaccaadcbccdbbabbabdcbaaaaabaadacddcacababcdababbcdadddbbaabaccadaad" "")  (str.++  "caaacccdbccbdbaccaa" H "bccdbbabbabdcbaaaaabaadacddcacababcdababbcdadddbbaabaccadaad") ))
(assert (= (str.++  "aaccabcbcacacabdcacbdbcdcddabcbbbcdcbabccbdbcccadd" H "ccbabbd" H "daaccccaccaaac" H "acba")  (str.++  "aaccabcbcacacabdcacbdbcdcddabcbbbcdcbabccbdbcccadd" H "ccbabbd" H "daaccccaccaaacdcacba") ))
(assert (= (str.++  "baddadaccbaacddcacadaadabbbdabcc" H "cdddbacaabaccc" H "aadadbccba" H "cbcbcbcdcdaadacabaa")  (str.++  "baddadaccbaacddcacadaadabbbdabccdccdddbacaabacccdcaadadbccbadccbcbcbcdcdaadacabaa" "") ))
(assert (= (str.++  "cabccccbbcaacddadbbadbdcdabbdd" H "ccbcba" H "bcaddcbbbcbcacaadbdaaaadbcbdd" H "cdbcccadcc")  (str.++  "cabccccbbcaacddadbbadbdcdabbdddcccbcbadcbcad" H "bbbcbcacaadbdaaaadbcbdd" H "cdbcccadcc") ))
(assert (= (str.++  "ccbabacacbcbbabccaabdbcadbddaadc" H "caccdbbcaaabdabc" H "bccaccabb" H "aaccadbabbabaddbac")  (str.++  "ccbabacacbcbbabccaabdbcadbddaadc" H "caccdbbcaaabdabcdcbccaccabbdcaaccadbabbabaddbac") ))
(assert (= (str.++  "ddaabbdadadcd" H "ccbbbdcdacccadbbaabaaccddaddbdabccbbdbbdacbccbcaadbcbdaddabcdbacbc")  (str.++  "ddaabbdadadcddcccbbbdcdacccadbbaabaaccddaddbdabccbbdbbdacbccbcaadbcbdaddabcdbacbc" "") ))
(assert (= (str.++  A "acacaaaacddbdcdddbbcadbdcaccdbbbcdaaaaaaabaaacacddaaacabddbcccbbbddbcdaaaadaa" "")  (str.++  "adcaacacaaaacddbdcdddbbcadb" H "accdbbbcdaaaaaaabaaacacddaaacabddbcccbbbddbcdaaaadaa") ))
(assert (= (str.++  "b" H "bdcd" H "abdbabcbdaabcbb" H "cacabbbaabdaaccbcdbccaaadacab" H "baddadbb" H "abbcbbbccbdabd")  (str.++  "bdcbdcddcabdbabcbdaabcbbdccacabbbaabdaaccbcdbccaaadacabdcbaddadbbdcabbcbbbccbdabd" "") ))
(assert (= (str.++  "adcabbbbcdcdaaaddabadadcdaaadbddacdaccdbabbcbcbdaabccacaabaacabcacdbd" H "dbdbbdcbcd")  (str.++  "a" H "abbbbcdcdaaaddabada" H "daaadbddacdaccdbabbcbcbdaabccacaabaacabcacdbd" H "dbdbb" H "bcd") ))
(assert (= (str.++  "adbbacdbcbbcaab" H "acabcbdcddabababdaabdaabb" H "bddcbbcbbaadbacdcabddadbabcca" A "bbbb")  (str.++  "adbbacdbcbbcaabdcacabcbdcddabababdaabdaabb" H "bddcbbcbbaadbac" H "abddadbabccaa" H "abbbb") ))
(assert (= (str.++  "addbacbbcdbcacccadbaccbabbbacbcbbcbbabd" H "ddabddcdaadadddbbaccccbcdacbdbaadbadddab")  (str.++  "addbacbbcdbcacccadbaccbabbbacbcbbcbbabddcddabddcdaadadddbbaccccbcdacbdbaadbadddab" "") ))
(assert (= (str.++  "badbddacbaabacdabadaacabcdcbaabdddbbdaaddbaabcbb" H "db" H "abaaaddbcdbdbcabbbaabcddcdd")  (str.++  "badbddacbaabacdabadaacabcdcbaabdddbbdaaddbaabcbbdcdbdcabaaaddbcdbdbcabbbaabcddcdd" "") ))
(assert (= (str.++  "ccdaaaabadbabdadbdcbaaaabbabcddacbcac" H "db" H "dbaddddbdaabbbdbcac" H "bddcbddbabccaabdc")  (str.++  "ccdaaaabadbabdadb" H "baaaabbabcddacbcacdcdbdcdbaddddbdaabbbdbcac" H "bddcbddbabccaabdc") ))
(assert (= (str.++  H "ddbcbacbbdaabbbcaacaababccbcbdcbcbacbcaabcaddbdabdbadbcbcaaabbab" H "dbbabccbacbba")  (str.++  H "ddbcbacbbdaabbbcaacaababccbcbdcbcbacbcaabcaddbdabdbadbcbcaaabbab" H "dbbabccbacbba") ))
(assert (= (str.++  "baadcbbddaacbdadababadbccdacbddcd" H "dd" H "db" H "dadddaddbabacabcbcaccaccbbdddabbacdbbc")  (str.++  "baadcbbddaacbdadababadbccdacbddcd" H "dddcdb" H "dadddaddbabacabcbcaccaccbbdddabbacdbbc") ))
(assert (= (str.++  "bddcadbabcddaadaaccadbadcbbbaaaadacba" H "cadbccbabbacdcbcabcdacaccabcdadabbdaadadab")  (str.++  "bddcadbabcddaadaaccadba" H "bbbaaaadacbadccadbccbabbac" H "bcabcdacaccabcdadabbdaadadab") ))
(assert (= (str.++  "daabbbcdccbbbcbdaccddaaba" H "dddbabbcadbb" H "caadabdccbcdcdcaacbacd" H "dadabacc" H "cbdadd")  (str.++  "daabbbc" H "cbbbcbdaccddaabadcdddbabbcadbb" H "caadab" H "cbc" H H "aacbacddcdadabaccdccbdadd") ))
(assert (= (str.++  "cbaaabdcdbcacd" H "ccd" H "daccaaabdaadbaacaadbbabcaabaaadaabbcdbdbaabcbcca" H "dacbdb" H "da")  (str.++  "cbaaab" H "dbcacd" H "ccd" H "daccaaabdaadbaacaadbbabcaabaaadaabbcdbdbaabcbccadcdacbdb" H "da") ))
(assert (= (str.++  "ccccbadcddccaddbdbacaccbacccadaa" H "bbacaadadccbdadbdbdbccbdcaacbdabbdbaadbbdbccaab")  (str.++  "ccccbadcddccaddbdbacaccbacccadaa" H "bbacaada" H "cbdadbdbdbccbdcaacbdabbdbaadbbdbccaab") ))
(assert (= (str.++  "ddabbbaddaaacccbacb" H "cddaccdccdbdddbdbd" H "daabadacbabbbad" H "dbdcbacdbdaaadccacaacaa")  (str.++  "ddabbbaddaaacccbacbdccddacc" H "cdbdddbdbddcdaabadacbabbbad" H "dbdcbacdbdaaadccacaacaa") ))
(assert (= (str.++  "bdbbccbcbabddccdbaabbdcdbdcabda" H "bddbcadcdbdcadaacacdabcdd" H "bccdbcdbdbbaadacdcdbd")  (str.++  "bdbbccbcbabd" H "cdbaabbdcdbdcabdadcbddbca" H "dbdcadaacacdabcdd" H "bccdbcdbdbbaadacdcdbd") ))
(assert (= (str.++  "dbcacbcc" H "aaddddcbbcdbbdadacacbddddcba" H "addbdbbadbcabccdaaadc" H "bcdbaaacc" A "c" H "da")  (str.++  "dbcacbccdcaaddddcbbcdbbdadacacbddd" H "badcaddbdbbadbcabccdaaadc" H "bcdbaaacca" H "acdcda") ))
(assert (= (str.++  "abcabacabaaadacaadb" H "adaccdabaaddbaadabcbabdbbcddddcd" H "dbacdacacabbbaabacbad" H "b" H)  (str.++  "abcabacabaaadacaadbdcadaccdabaaddbaadabcbabdbbcddddcd" H "dbacdacacabbbaabacbad" H "bdc") ))
(assert (= (str.++  "daaaaabbbbccabcdabaccabacbaac" H "dababbaddadbddacbdbabcabaabbddbacbdbbdbbcdad" A "da")  (str.++  "daaaaabbbbccabcdabaccabacbaacdcdababbaddadbddacbdbabcabaabbddbacbdbbdbbcdad" A "da") ))
(assert (= (str.++  "bbbdadbdabbcdadbdabbacddddbccddcdbaaaaabbbbacdbbbaddddbccbbcdadaabbcb" H "baaddadbca")  (str.++  "bbbdadbdabbcdadbdabbacddddbccd" H "dbaaaaabbbbacdbbbaddddbccbbcdadaabbcbdcbaaddadbca") ))
(assert (= (str.++  "abbabdcb" H "cdaabcababcaddcbbbbbbaddabdbccdcc" H "abdcdaacaacdd" H "acaadccbcbadcaacabcbb")  (str.++  "abbab" H "b" H "cdaabcababcad" H "bbbbbbaddabdbcc" H "cdcabdcdaacaacdd" H "acaadccbcba" H "aacabcbb") ))
(assert (= (str.++  "ccabbabacdcccbdababddaacbddbcabddbdbabbcadcadbacbcccacbdbaccadccaacacacbcddaaacac" "")  (str.++  "ccabbabacdcccbdababddaacbddbcabddbdbabbca" H "adbacbcccacbdbacca" H "caacacacbcddaaacac") ))
(assert (= (str.++  "aaba" H "dddcadccbadacbabaddaaadaadbbdacdabacdd" H "ddbaaaccadcaacdcadcab" H "accbccbdbadd")  (str.++  "aabadcdd" H "adccbadacbabaddaaadaadbbdacdabacdd" H "ddbaaacc" A "ac" H "a" H "abdcaccbccbdbadd") ))
(assert (= (str.++  "bbabdb" H "ddaddbacaacddbdddbacdbbdbdbaaaacdddbdadaabdbaaaaddbbabcabddbbbbddbcacaabc")  (str.++  "bbabdb" H "ddaddbacaacddbdddbacdbbdbdbaaaacdddbdadaabdbaaaaddbbabcabddbbbbddbcacaabc") ))
(assert (= (str.++  "dbaacddaadaaccadabddbddcdabaa" H "aacbccbcbdacbbcacddbccbbadaabcddbbcba" H "babdabaccbb")  (str.++  "dbaacddaadaaccadabddbd" H "dabaadcaacbccbcbdacbbcacddbccbbadaabcddbbcba" H "babdabaccbb") ))
(assert (= (str.++  "dbaccbcbaadbcababcbabadabdabacdaadbbcaadaaacaba" H "dbaccacaddba" H "cabcbbadacacbdbb" H)  (str.++  "dbaccbcbaadbcababcbabadabdabacdaadbbcaadaaacabadcdbaccacaddbadccabcbbadacacbdbb" H) ))
(assert (= (str.++  "cacaacadbdbbbbbcbbccadbbcbcbccabbbccbddbdc" H "aadadbcaabacdaadbdabccaaccaacbdccbdcc")  (str.++  "cacaacadbdbbbbbcbbccadbbcbcbccabbbccbddb" H "dcaadadbcaabacdaadbdabccaaccaacbdccbdcc") ))
(assert (= (str.++  H "bbdbabdadbdccd" H "abbdccabdbbccaadadb" H "bbccbdbaddddbaaaddacababcaddbcccbbcbc" H H "b")  (str.++  "dcbbdbabdadb" H "cd" H "abbdccabdbbccaadadb" H "bbccbdbaddddbaaaddacababcaddbcccbbcbc" H "dcb") ))
(assert (= (str.++  "adbbabcaddacacddbbccbadbcdacabdbabbcbdabaabbdddad" H "ccadabdccadaddadacabbbacbbbcac")  (str.++  "adbbabcaddacacddbbccbadbcdacabdbabbcbdabaabbdddad" H "ccadab" H "cadaddadacabbbacbbbcac") ))
(assert (= (str.++  "bccaaddabcbcaccbbbcdddabcaadabdabbdbcccadadaacbbdadbcadbcaabaaaabbbdadbb" H "badbaca")  (str.++  "bccaaddabcbcaccbbbcdddabcaadabdabbdbcccadadaacbbdadbcadbcaabaaaabbbdadbb" H "badbaca") ))
(assert (= (str.++  "ccddacbcaaaccccbcbbbbcacccbdcbcddbbabdbdaadbbc" H H "baacbadacbbba" H "badcadbbdacadbac")  (str.++  "ccddacbcaaaccccbcbbbbcacccb" H "bcddbbabdbdaadbbcdc" H "baacbadacbbba" H "b" A "dbbdacadbac") ))
(assert (= (str.++  "bacddcdcdacabacdcbc" H "dbcabadddbcaccabdadadaadbbcddad" H "dadcdadbccabbccbacadaabacba")  (str.++  "bacddcdcdacabacdcbcdcdbcabadddbcaccabdadadaadbbcddaddcda" H "dadbccabbccbacadaabacba") ))
(assert (= (str.++  "abcdbbbbdadbdccabcbcacc" H "cbbabcacdabdacacdcbcddabbcb" H "ccbaaacbabadbbbbdcdccaca" H "d")  (str.++  "abcdbbbbdadbdccabcbcaccdccbbabcacdabdacacdcbcddabbcbdcccbaaacbabadbbbbdcdccaca" H "d") ))
(assert (= (str.++  "acbcacadcdabdbccaab" H "aacaadbccdddcbdcdaac" H "dadddbabdbbdddadaddacbbcbdbdacbbcbcacd")  (str.++  "acbcacadcdabdbccaab" H "aacaadbccdd" H "b" H "daacdcdadddbabdbbdddadaddacbbcbdbdacbbcbcacd") ))
(assert (= (str.++  "baabbbbadaac" H "bacc" H "bbabababaac" H "ccccbcaadbcbadcbadbdbb" H "dbadbc" A "b" H "dddbbcadbcb")  (str.++  "baabbbbadaac" H "bacc" H "bbabababaac" H "ccccbcaadbcbadcbadbdbbdcdbadbca" H "abdcdddbbcadbcb") ))
(assert (= (str.++  "db" H "caccacccc" H "ababdaabccabd" H "dcabbbcaabacdaaddacdbdbcbccddaacbbcdabdbcddadaacdca")  (str.++  "db" H "caccacccc" H "ababdaabccabd" H "dcabbbcaabacdaaddacdbdbcbccddaacbbcdabdbcddadaac" H "a") ))
(assert (= (str.++  "bccabda" H "dbaacccabdadadb" H "bdadbccdbcacacbaccbacbbbcbdbcdbccbdaaabbcaadabddbab" H "db")  (str.++  "bccabda" H "dbaacccabdadadbdcbdadbccdbcacacbaccbacbbbcbdbcdbccbdaaabbcaadabddbabdcdb") ))
(assert (= (str.++  "daaabaccaccaacbabdcddba" H "dbbdcdddaccbabdcabcbdcabdadbabdbdabdaaaadccabadcdbdbcbdd")  (str.++  "daaabaccaccaacbab" H "ddbadcdbbdcdddaccbabdcabcbdcabdadbabdbdabdaaaa" H "caba" H "dbdbcbdd") ))
(assert (= (str.++  "cbdaccadaca" H "bddbbbbaabbbbddaacdadabaaabacbddcdcccbdaaaddaccbabcaaccacdadabbcbdcb")  (str.++  "cbdaccadacadcbddbbbbaabbbbddaacdadabaaabacbd" H "dcccbdaaaddaccbabcaaccacdadabbcbdcb") ))
(assert (= (str.++  "dda" H "ddbcadcaaaca" H "bdcacbadccbcccacddaabcbbacabbacdababcacabbdbabdddbbcda" H "cabcbc")  (str.++  "ddadcddbcadcaaacadcb" H "acbadccbcccacddaabcbbacabbacdababcacabbdbabdddbbcdadccabcbc") ))
(assert (= (str.++  "bcddbbbca" H "cabbdabcccddcabbdcddbbaadadbbbdbabbabadbadcdacaacdaccadd" H "dbbaadda" H "ba")  (str.++  "bcddbbbcadccabbdabcccddcabb" H "ddbbaadadbbbdbabbabadbadcdacaacdaccadd" H "dbbaaddadcba") ))
(assert (= (str.++  "bbbacccbadcadcdbbcdadbbbdcd" H "ddbb" H "cdcbcbacdbbcbbbabbbcbaacbacccccdacadbbdbacaddd")  (str.++  "bbbacccba" H "a" H "dbbcdadbbb" H "ddcddbb" H "c" H "bcbacdbbcbbbabbbcbaacbacccccdacadbbdbacaddd") ))
(assert (= (str.++  "bdddbbbccddb" H "cbdd" A H "dcadcdbadaaaaacdd" H "dac" H "abb" H "ddcaacabacbdbbcaddcddcddabaa")  (str.++  "bdddbbbccddbdccbdda" H "adc" H "a" H "dbadaaaaacdd" H "dacdcabbdcd" H "aacabacbdbbcaddcd" H "ddabaa") ))
(assert (= (str.++  "addaccdbcbbdddbbdbdabcacbabcbddbddaacdcbaccccdccbbcbdbbdcbddb" H "cbabdbccddcacbbbcd")  (str.++  "addaccdbcbbdddbbdbdabcacbabcbddbddaac" H "bacccc" H "cbbcbdbbdcbddb" H "cbabdbccd" H "acbbbcd") ))
(assert (= (str.++  "cbccabaabbaaacdbbcdabbbccadcdcddadbacddcddaadacbdccdbaccacb" A "bcbcbd" H "acbadccddd")  (str.++  "cbccabaabbaaacdbbcdabbbccadcdcddadbacddcddaadacbdccdbaccacba" H "abcbcbd" H "acba" H "cddd") ))
(assert (= (str.++  "ddaab" H "adccbccdcacbddaddadddaccabbbccbddbdbbcdcccdabdbaadaddddadaaccdacbbaddaaacd")  (str.++  "ddaab" H "a" H "cbccdcacbddaddadddaccabbbccbddbdbbc" H "ccdabdbaadaddddadaaccdacbbaddaaacd") ))
(assert (= (str.++  "badbdacdaaabbddcdcbccccbdbcbdbdadccaaaabbbabdbcccaacdcacbbcad" H "abaccdbbccaabcb" H "a")  (str.++  "badbdacdaaabbddc" H "bccccbdbcbdbda" H "caaaabbbabdbcccaacdcacbbcaddcabaccdbbccaabcb" H "a") ))
(assert (= (str.++  "abbbadcc" H "baabcdaacab" H "d" H "bdaaadaccabaccdbddabdddacdddaadabdacbcbadcdbcbcaacbbbdb")  (str.++  "abbba" H "cdcbaabcdaacabdcd" H "bdaaadaccabaccdbddabdddacdddaadabdacbcba" H "dbcbcaacbbbdb") ))
(assert (= (str.++  "bbdabaddaaddaccaaaacbccdabadccb" H "ccbddbdbcccbdadcdcccbcc" H "ababbadabbdbbacaa" H "c" H "c")  (str.++  "bbdabaddaaddaccaaaacbccdabadccbdcccbddbdbcccbda" H H "ccbccdcababbadabbdbbacaadcc" H "c") ))
(assert (= (str.++  "baaadadbbbdbccacbdacbcccaaccbaddabbbcbdaabcbdbbdaddbbdbdaabbdbadbcbbcbad" H "aaababc")  (str.++  "baaadadbbbdbccacbdacbcccaaccbaddabbbcbdaabcbdbbdaddbbdbdaabbdbadbcbbcbad" H "aaababc") ))
(assert (= (str.++  "cacadacacbbddacdaabbadbdaaaabacbadacabccba" H "adcbcccbacbac" H "acccbbdbbbdcdbdbbbdbbc")  (str.++  "cacadacacbbddacdaabbadbdaaaabacbadacabccba" H "a" H "bcccbacbac" H "acccbbdbbb" H "dbdbbbdbbc") ))
(assert (= (str.++  "cccabdabbdbdddadaabaddbdddabacaaadddcbaddabbbddadbbaca" H "acbcabbdbabcdbcbdcbdbaddc")  (str.++  "cccabdabbdbdddadaabaddbdddabacaaadddcbaddabbbddadbbaca" H "acbcabbdbabcdbcb" H "bdbad" H) ))
(assert (= (str.++  "bbabdbabddccaacabdddaaaaabbdcadacbbdadcddbcbccdadbadabdbdbabaccdacbcdabbacdbcbcac" "")  (str.++  "bbabdbabd" H "caacabdddaaaaabb" H "adacbbdadcddbcbccdadbadabdbdbabaccdacbcdabbacdbcbcac") ))
(check-sat)

(exit)

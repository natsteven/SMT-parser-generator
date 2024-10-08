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
(declare-fun E () String)
(declare-fun A () String)
(declare-fun C () String)
(declare-fun D () String)
(assert (= (str.++  "ba" C "eeee" D "bdedaefeebfffafafbaceecacefbbefcbbc")  (str.++  E "efcbbc" "") ))
(assert (= (str.++  "dfcbfbcdecfaaabccbbbfbfbaeefddfbebffaabaaeebdfbcbdafd" "")  (str.++  "dfcbfbcdecfaaabc" C "fbfbaeefddfbebffaabaaeebdfbcbdafd") ))
(assert (= (str.++  "dfbbcdcaacbffcecdcccbaffbfef" C "deaafcecbcdbbeeefcbbc")  (str.++  "dfbbcdcaacbffcecdcccbaffbfef" C "deaafcecbcdbbeeefcbbc") ))
(assert (= (str.++  "acaaafceefcafadbcaaccbbbfaabfcfedceddaedcebaeacbcbfdb" "")  (str.++  "acaaafceefcafadbcaac" C "faabfcfedceddaedcebaeacbcbfdb") ))
(assert (= (str.++  "ccb" C "cfcafcbaebfdfafccccecedaeabddccfefcacfefebebde")  (str.++  "ccb" C "cfcafcbaebfdfafccccecedaeabddccfefcacfefebebde") ))
(assert (= (str.++  "dcfaaeafedede" C "afaeebacfdbadcecaaafcbddaeeadfceedcc")  (str.++  "dcfaaeafedede" C "afaeebacfdbadcecaaafcbddaeeadfceedcc") ))
(assert (= (str.++  "edbfccbfbbfecfcfeddacbadaaaaffc" C "efecbffafcfbcebcce")  (str.++  "edbfccbfbbfecfcfeddacbadaaaaffc" C "efecbffafcfbcebcce") ))
(assert (= (str.++  "adfbdefeafaaeadeeecfebecdccebadbefebeccbbbeaccedbcebf" "")  (str.++  "adfbdefeafaaeadeeecfebecdccebadbefebec" C "eaccedbcebf") ))
(assert (= (str.++  "fccdeccbdddedebfcaabbeebfdcdedcaedcdafafbccdcded" C "c")  (str.++  "fccdeccbdddedebfcaabbeebfdcdedcaedcdafafbccdcded" C "c") ))
(assert (= (str.++  "baeaeedafafbcffebbebdedcfedceeaeadfedbeddecfa" C "fabe")  (str.++  "baeaeedafafbcffebbebdedcfedceeaeadfedbeddecfa" C "fabe") ))
(assert (= (str.++  "ffdeccfaccccdfebefddfbbcbbbabbffdedeedababebdecfddbea" "")  (str.++  "ffdeccfaccccdfebefddfbb" C "abbffdedeedababebdecfddbea") ))
(assert (= (str.++  "ecceeceeefcbededcbafccedacfdea" C "fffcdeabaacefdeabfd")  (str.++  "ecceeceeefcbededcbafccedacfdeacbbbfffcdeabaacefdeabfd" "") ))
(assert (= (str.++  "fbbffaebfc" C "dfbcdefbbcbeabbabbfdefeecaacfccdbadbcbc")  (str.++  "fbbffaebfccbbbdfbcdefbbcbeabbabbfdefeecaacfccdbadbcbc" "") ))
(assert (= (str.++  "bfdeccebdbacafceeacbfdfbfdeafcbeccbdefecfcabbecbbbded" "")  (str.++  "bfdeccebdbacafceeacbfdfbfdeafcbeccbdefecfcabbe" C "ded") ))
(assert (= (str.++  "febbafefdfabfadfafbffadbcfddfddaffabacaecf" C "dccdaac")  (str.++  "febbafefdfabfadfafbffadbcfddfddaffabacaecf" C "dccdaac") ))
(assert (= (str.++  "aacfccbecbccbfaaaddcebadeefecceddbeddaecbbbbbfadcdbeb" "")  (str.++  "aacfccbecbccbfaaaddcebadeefecceddbeddae" C "bbfadcdbeb") ))
(assert (= (str.++  "bbabfaacbbbbedbcaaecdbaefbfdafebbdceebfbdedbbeceffbbe" "")  (str.++  "bbabfaa" C "bedbcaaecdbaefbfdafebbdceebfbdedbbeceffbbe") ))
(assert (= (str.++  "fbdabdafdcdcacbeaeabaaddfaecbac" C "eabafabbfcfbdffcac")  (str.++  "fbdabdafdcdcacbeaeabaaddfaecbac" C "eabafabbfcfbdffcac") ))
(assert (= (str.++  "aacbdfecbbfffecfddbbcdafadefaacdbbbbcecdccccfa" C "dcd")  (str.++  "aacbdfecbbfffecfddbbcdafadefaacdbbbbcecdccccfacbbbdcd" "") ))
(assert (= (str.++  "dbdcfddecedddeccebeddcddfdbfedbbdcacfeecffebffcfcbbbd" "")  (str.++  "dbdcfddecedddeccebeddcddfdbfedbbdcacfeecffebffcf" C "d") ))
(assert (= (str.++  "fdebbfcbbbbdeccaaddfecaefecdddfaeffdaeaedccaedcbabeed" "")  (str.++  "fdebbf" C "bdeccaaddfecaefecdddfaeffdaeaedccaedcbabeed") ))
(assert (= (str.++  "baecbcebbdbdeeafebfcefedcbcddfdddbde" C "effabfbaaccbc")  (str.++  "baecbcebbdbdeeafebfcefedcbcddfdddbde" C "effabfbaaccbc") ))
(assert (= (str.++  "eddbeacffcbabacedefecdccaabececaeccebaeeadcbbbfeafcdd" "")  (str.++  "eddbeacffcbabacedefecdccaabececaeccebaeead" C "feafcdd") ))
(assert (= (str.++  "aabecacbbfdfcc" C "adddcdeacaafedefaabffefdaaeecdacced")  (str.++  "aabecacbbfdfcccbbbadddcdeacaafedefaabffefdaaeecdacced" "") ))
(assert (= (str.++  "ceccaddaae" C "efeabaabbcfcefedefdeccdafabedbaffcbcbdc")  (str.++  "ceccaddaae" C "efeabaabbcfcefedefdeccdafabedbaffcbcbdc") ))
(assert (= (str.++  "fbceb" C "acefdbeffbed" A "decceeacbbebe")  (str.++  "fbcebcfedf" E "e") ))
(assert (= (str.++  "aebeeccdfbbedacabebafdadadabaedcceeacdfbeacfa" B "cfeee")  (str.++  "aebeeccdfbbedacabebafdadadabaedcceeacdfbeacfadeacfeee" "") ))
(assert (= (str.++  "fbeafdfcdafaaddedab" B "dbebdaceabafdeeaaccdeadbbdbcbaa")  (str.++  "fbeafdfcdafaaddedab" B "dbebdaceabafdeeaaccdeadbbdbcbaa") ))
(assert (= (str.++  "eabddbfacfdcddcabdfcaddbcdfebdabbcecbaadbfcddaabb" B "d")  (str.++  "eabddbfacfdcddcabdfcaddbcdfebdabbcecbaadbfcddaabbdead" "") ))
(assert (= (str.++  "cefba" B "cccbcafbffdeacecfbeddedfdcecebfefefacafabfdba")  (str.++  "cefba" B "cccbcafbffdeacecfbeddedfdcecebfefefacafabfdba") ))
(assert (= (str.++  "afeeafeeaabceccbfffcefeeefdcdabdeccbcc" B "bdbabfebabcd")  (str.++  "afeeafeeaabceccbfffcefeeefdcdabdeccbccdeabdbabfebabcd" "") ))
(assert (= (str.++  "bceefcceabfdcbfbbaecedeadadecfebaabdfabbbaceafbebeebb" "")  (str.++  "bceefcceabfdcbfbbaece" B "dadecfebaabdfabbbaceafbebeebb") ))
(assert (= (str.++  "cdfcfffdbbaeebeddbfebddbcddfcbcc" B "bfaccffcebbdfeacba")  (str.++  "cdfcfffdbbaeebeddbfebddbcddfcbcc" B "bfaccffcebbdfeacba") ))
(assert (= (str.++  "deafbdaccaeaeacabafdccaeacdbddceedbefedadcfccfbfaebed" "")  (str.++  B "fbdaccaeaeacabafdccaeacdbddceedbefedadcfccfbfaebed" "") ))
(assert (= (str.++  "dcdfebafadacbfa" B "bfcbbdaefabeaecfdabbfbffffaafeabfeb")  (str.++  "dcdfebafadacbfadeabfcbbdaefabeaecfdabbfbffffaafeabfeb" "") ))
(assert (= (str.++  "eeeefbdcbaacffdecbedecbbccfbaeefaaecbdffbebcceefdeabe" "")  (str.++  "eeeefbdcbaacffdecbedecbbccfbaeefaaecbdffbebcceef" B "be") ))
(assert (= (str.++  "fdfebaccbdbeefeaaccd" B "cbbfaabbbafcbfcebacfccfedbbeda")  (str.++  "fdfebaccbdbeefeaaccd" B "cbbfaabbbafcbfcebacfccfedbbeda") ))
(assert (= (str.++  "aebaafccbfbfaceccedabcedcc" B "afcdbaedaccffdddffdaaaeb")  (str.++  "aebaafccbfbfaceccedabcedcc" B "afcdbaedaccffdddffdaaaeb") ))
(assert (= (str.++  "acfdeacccdafadbebabdfcafaebbddcdfcfffddffceeacefcbcac" "")  (str.++  "acf" B "cccdafadbebabdfcafaebbddcdfcfffddffceeacefcbcac") ))
(assert (= (str.++  B "cacaaedacaeddfbcfdfefeafacdefeccbeceadaeaefccbfbef" "")  (str.++  "deacacaaedacaeddfbcfdfefeafacdefeccbeceadaeaefccbfbef" "") ))
(assert (= (str.++  "baf" B "fbcddebaafafbbfeeeacfaccccfbadcaebfccaaaadfbeba")  (str.++  "baf" B "fbcddebaafafbbfeeeacfaccccfbadcaebfccaaaadfbeba") ))
(assert (= (str.++  "dabeadaedcdeaffdecfbadeffcdaedcacfaefacedcfffdcbccbdf" "")  (str.++  "dabeadaedc" B "ffdecfbadeffcdaedcacfaefacedcfffdcbccbdf") ))
(assert (= (str.++  "acbefcbebafbdbedbfcfddafbedceb" B "befadfbfcbfcddcaabea")  (str.++  "acbefcbebafbdbedbfcfddafbedcebdeabefadfbfcbfcddcaabea" "") ))
(assert (= (str.++  B "aedcbcddbebbcadaaddafecebdefabcceccaafeabdcaadedea" "")  (str.++  "deaaedcbcddbebbcadaaddafecebdefabcceccaafeabdcaadedea" "") ))
(assert (= (str.++  "b" B "ebdfeffbbebbdfacfadccedeecbcfbffeccdccaefededecec")  (str.++  "b" B "ebdfeffbbebbdfacfadccedeecbcfbffeccdccaefededecec") ))
(assert (= (str.++  "cffccbcefeeecbdcfcdffeacaccbafdbcbcaaafcebfeaed" B "bad")  (str.++  "cffccbcefeeecbdcfcdffeacaccbafdbcbcaaafcebfeaeddeabad" "") ))
(assert (= (str.++  "aafba" B "cafaffeacfbffcefdfcdabdecbedcedeeabbcdcbedbef")  (str.++  "aafba" B "cafaffeacfbffcefdfcdabdecbedcedeeabbcdcbedbef") ))
(assert (= (str.++  "aebbcecdaffdaaffadacbbabafedafffacfbadb" B "ecbccebbdfb")  (str.++  "aebbcecdaffdaaffadacbbabafedafffacfbadb" B "ecbccebbdfb") ))
(assert (= (str.++  "afbfbceabbfacdadffdbcfcffdcbbc" B "afcecabddbeefeceacbb")  (str.++  "afbfbceabbfacdadffdbcfcffdcbbc" B "afcecabddbeefeceacbb") ))
(assert (= (str.++  "fcacadcecdceebecffbaeac" B "bcbaaceaceabcbbcddfabfacacd")  (str.++  "fcacadcecdceebecffbaeac" B "bcbaaceaceabcbbcddfabfacacd") ))
(assert (= (str.++  "acffbcbdddcbffbfbbbedacacfbfebcddeaaacdcabbbbabfbdfca" "")  (str.++  "acffbcbdddcbffbfbbbedacacfbfebcd" B "aacdcabbbbabfbdfca") ))
(assert (= (str.++  "deafbdaeaaceacdbffddaebddbbaeffdecbdccecbcacafcecfbcd" "")  (str.++  B "fbdaeaaceacdbffddaebddbbaeffdecbdccecbcacafcecfbcd" "") ))
(assert (= (str.++  "ffcfeaaaacbecebccbbaddcedcfdabbdabaacaeee" B "aadcecade")  (str.++  "ffcfeaaaacbecebccbbaddcedcfdabbdabaacaeee" B "aadcecade") ))
(assert (= (str.++  "deffaeaddcecaedcb" B "ccdfdcaedbbcfcdbbeccbcaebdeffbbfa")  (str.++  "deffaeaddcecaedcbdeaccdfdcaedbbcfcdbbeccbcaebdeffbbfa" "") ))
(assert (= (str.++  "fabcabcccefdabedcaeeadbdaeebdcebacccddffdaca" B "eeaaeb")  (str.++  "fabcabcccefdabedcaeeadbdaeebdcebacccddffdacadeaeeaaeb" "") ))
(assert (= (str.++  "adafafdfbfddaefcabdeabbedcfbeeafcebffadfafecacfddcebd" "")  (str.++  "adafafdfbfddaefcab" B "bbedcfbeeafcebffadfafecacfddcebd") ))
(assert (= (str.++  "fdabfdabdaaccadbacaeeccaddaddfcdcfad" B "edacdbbebcefbe")  (str.++  "fdabfdabdaaccadbacaeeccaddaddfcdcfad" B "edacdbbebcefbe") ))
(assert (= (str.++  "ffbbbeceecefce" B "ddfffaeecbeefcffcafcdaecdcfddefffece")  (str.++  "ffbbbeceecefcedeaddfffaeecbeefcffcafcdaecdcfddefffece" "") ))
(assert (= (str.++  "ddeceafffabbdbabccaabaadbaeaccefcdbeafbe" B "bafcbcefbb")  (str.++  "ddeceafffabbdbabccaabaadbaeaccefcdbeafbedeabafcbcefbb" "") ))
(assert (= (str.++  "bceabbffbdecaaeacecafddcbeadeadeacebabefacfccccdadcbc" "")  (str.++  "bceabbffbdecaaeacecafddcbea" B B "cebabefacfccccdadcbc") ))
(assert (= (str.++  "dcefcdcedabddddbfefdadeaeffacdfffbcebebfdaceccddfddaa" "")  (str.++  "dcefcdcedabddddbfefda" B "effacdfffbcebebfdaceccddfddaa") ))
(assert (= (str.++  "ccdcdeafeedfacecabebebdabfcffbadbccdeedbadacdeaddeeda" "")  (str.++  "ccdc" B "feedfacecabebebdabfcffbadbccdeedbadac" B "ddeeda") ))
(assert (= (str.++  "cfeeacaaeedcfbffbbafbabccbbdcccafefbbfbbaeeabbaddeacf" "")  (str.++  "cfeeacaaeedcfbffbbafbabccbbdcccafefbbfbbaeeabbad" B "cf") ))
(assert (= (str.++  "deacffafedecceaceaecdcacbcfcffbfbabddeeceadbffbcacebd" "")  (str.++  B "cffafedecceaceaecdcacbcfcffbfbabddeeceadbffbcacebd" "") ))
(assert (= (str.++  "fffbbedacfecfcf" B "fecceebaecfbfaeabeaeaabbedceabafffc")  (str.++  "fffbbedacfecfcfdeafecceebaecfbfaeabeaeaabbedceabafffc" "") ))
(assert (= (str.++  "fdbabbcbbadcedcbeefecffdbdba" B B "defbeaaebabdffabbbf")  (str.++  "fdbabbcbbadcedcbeefecffdbdbadeadeadefbeaaebabdffabbbf" "") ))
(assert (= (str.++  "efeeebfaadcfdfbfeaaecaafaaaafbdafabccccdaea" B "faebeff")  (str.++  "efeeebfaadcfdfbfeaaecaafaaaafbdafabccccdaeadeafaebeff" "") ))
(assert (= (str.++  "dcffafcdeaeeacbbccfdeccbabcdabeeccebecfdcedefdbadecab" "")  (str.++  "dcffafc" B "eeacbbccfdeccbabcdabeeccebecfdcedefdbadecab") ))
(assert (= (str.++  "eccecfcfbaccafffdfebeabeacfecddee" B "ddbbccbffaeddafbe")  (str.++  "eccecfcfbaccafffdfebeabeacfecddeedeaddbbccbffaeddafbe" "") ))
(assert (= (str.++  "ebcabdbeacdbcabcdceeeaecfeeaccbfc" B "aabedfabaeaebbcea")  (str.++  "ebcabdbeacdbcabcdceeeaecfeeaccbfc" B "aabedfabaeaebbcea") ))
(assert (= (str.++  "dcecafe" B "bfcfcceccfbabecbbfecddbccbfceacbedcfcafdfba")  (str.++  "dcecafedeabfcfcceccfbabecbbfecddbccbfceacbedcfcafdfba" "") ))
(assert (= (str.++  "adaadbacbcbfc" B "ebaefebfecebafedbcfadfacdceaedecabded")  (str.++  "adaadbacbcbfc" B "ebaefebfecebafedbcfadfacdceaedecabded") ))
(assert (= (str.++  "fdafaedfebbfddedeafedbaebebaeaeaeeddddeeedaaccbdedecf" "")  (str.++  "fdafaedfebbfdde" B "fedbaebebaeaeaeeddddeeedaaccbdedecf") ))
(assert (= (str.++  "fedabcddacadeabafdcfcbcaeceaabecbcbfcbdfcbfaebefddcbc" "")  (str.++  "fedabcddaca" B "bafdcfcbcaeceaabecbcbfcbdfcbfaebefddcbc") ))
(assert (= (str.++  "dbedcaefddccfdeaaeabbbcbfeebaecbcbbcffefbfabffffadfff" "")  (str.++  "dbedcaefddccf" B "aeabbbcbfeebaecbcbbcffefbfabffffadfff") ))
(assert (= (str.++  "eaffdafaacbedeeafadfbdffaeefebdfeccadfdbdefdcfccce" B)  (str.++  "eaffdafaacbedeeafadfbdffaeefebdfeccadfdbdefdcfccce" B) ))
(assert (= (str.++  "caecbbbfecdeddaacabbffdeaecbafecceceeeccafaceebefabcf" "")  (str.++  "caecbbbfecdeddaacabbff" B "ecbafecceceeeccafaceebefabcf") ))
(assert (= (str.++  "cafcaaecdbbdeeddabcdbbdefaabbdfbdfd" B "dbdcadfbfcffced")  (str.++  "cafcaaecdbbdeeddabcdbbdefaabbdfbdfddeadbdcadfbfcffced" "") ))
(assert (= (str.++  "cddfbcbaddeedaabdacdffdafdeaecabadccdbaeefcbfbaebbfdf" "")  (str.++  "cddfbcbaddeedaabdacdffdaf" B "ecabadccdbaeefcbfbaebbfdf") ))
(assert (= (str.++  "becfeadafbb" B "deebbdcfabbcdaccbfdceeffbddeccebfdcdeca")  (str.++  "becfeadafbb" B "deebbdcfabbcdaccbfdceeffbddeccebfdcdeca") ))
(assert (= (str.++  "ddbafeaebbedfadfcabecacafef" B "accdadfbedcaafcbdacaecb")  (str.++  "ddbafeaebbedfadfcabecacafefdeaaccdadfbedcaafcbdacaecb" "") ))
(assert (= (str.++  "cefbacbedbadedec" B "befadcaddccfebccffdbaccabeccdbcdcc")  (str.++  "cefbacbedbadedecdeabefadcaddccfebccffdbaccabeccdbcdcc" "") ))
(assert (= (str.++  "dbfa" B "facdefcfabcfadfcbdbcaeedacdbeaddfdceecafdfafef")  (str.++  "dbfa" B "facdefcfabcfadfcbdbcaeedacdbeaddfdceecafdfafef") ))
(assert (= (str.++  "dbbffdaefdbaaceadeaeeccafaafcecbeabfbaafaadafecbdcdbf" "")  (str.++  "dbbffdaefdbaacea" B "eeccafaafcecbeabfbaafaadafecbdcdbf") ))
(assert (= (str.++  "deccafaccfcdfdfbdfeaeceebbdbfab" B "ecdeffcadcbbbfbebab")  (str.++  "deccafaccfcdfdfbdfeaeceebbdbfab" B "ecdeffcadcbbbfbebab") ))
(assert (= (str.++  "abfdedfaaccbdeacfbfadefefbaafdddddacffbbfcfbbfceacddd" "")  (str.++  "abfdedfaaccb" B "cfbfadefefbaafdddddacffbbfcfbbfceacddd") ))
(assert (= (str.++  "cdafaeedecdeefceaefbdeaabaeaeacecaabdcefcedbafebaaddd" "")  (str.++  "cdafaeedecdeefceaefb" B "abaeaeacecaabdcefcedbafebaaddd") ))
(assert (= (str.++  "fdefdeedefdddeaefadaecddbfbeebeddceffbeeaefddfcdadceb" "")  (str.++  "fdefdeedefdd" B "efadaecddbfbeebeddceffbeeaefddfcdadceb") ))
(assert (= (str.++  "abdffafdddafeaeeadbaddedbbbcddeaeafefdbbddaddeaadbbeb" "")  (str.++  "abdffafdddafeaeeadbaddedbbbcddeaeafefdbbddad" B "adbbeb") ))
(assert (= (str.++  "dafedabcbbbceceebfadcfccb" B "ecfdebdefffdcbcaaabefbaac")  (str.++  "dafedabcbbbceceebfadcfccbdeaecfdebdefffdcbcaaabefbaac" "") ))
(assert (= (str.++  "ddcbaafcfddfceeadeadbfebdedcebaccbacfcddfbcefdbfddcaf" "")  (str.++  "ddcbaafcfddfceea" B "dbfebdedcebaccbacfcddfbcefdbfddcaf") ))
(assert (= (str.++  "dcbbddeabbaafdffcefdeaffbfeebdfddccddccdbbbbcaebabcce" "")  (str.++  "dcbbd" B "bbaafdffcefdeaffbfeebdfddccddccdbbbbcaebabcce") ))
(assert (= (str.++  "aabeafbefdfceeebdbcdc" B "cdbecfeaefcfbcbaddbdcdfafffce")  (str.++  "aabeafbefdfceeebdbcdc" B "cdbecfeaefcfbcbaddbdcdfafffce") ))
(assert (= (str.++  "cfdefddabcfedafadddceecbffbfcefddfabfbeeffadffce" B "ed")  (str.++  "cfdefddabcfedafadddceecbffbfcefddfabfbeeffadffcedeaed" "") ))
(assert (= (str.++  "eddbcdcbfabbacaefcaaddb" B "aeecfacaafaadefcfddbbfdfffb")  (str.++  "eddbcdcbfabbacaefcaaddb" B "aeecfacaafaadefcfddbbfdfffb") ))
(assert (= (str.++  "feffdfaf" B "beebfedfbdbbeabecadeeaeffeecacecfdaebcafbf")  (str.++  "feffdfafdeabeebfedfbdbbeabecadeeaeffeecacecfdaebcafbf" "") ))
(assert (= (str.++  "bdbdbbddcffaafdfffcdcbacdafafdcdabcccbabcfcecdbde" B "b")  (str.++  "bdbdbbddcffaafdfffcdcbacdafafdcdabcccbabcfcecdbdedeab" "") ))
(assert (= (str.++  B "dcddacacadededdeebfdabddcaccfbaaffdadbeacdcecbaebf" "")  (str.++  "deadcddacacadededdeebfdabddcaccfbaaffdadbeacdcecbaebf" "") ))
(assert (= (str.++  "bbbfcacecfaadececdfeafedfbfaadeaeeaeedfdaaefbaebccaaa" "")  (str.++  "bbbfcacecfaadececdfeafedfbfaa" B "eeaeedfdaaefbaebccaaa") ))
(assert (= (str.++  "bdbccaaaaadfeefdfebdcdefebcfaafbdfcecbdeaefebcedbcbbf" "")  (str.++  "bdbccaaaaadfeefdfebdcdefebcfaafbdfcecb" B "efebcedbcbbf") ))
(assert (= (str.++  "ebaceebbbdfdeaeddedcbffdfafeeffdeddeefacdebbbdfab" B "c")  (str.++  "ebaceebbbdfdeaeddedcbffdfafeeffdeddeefacdebbbdfab" B "c") ))
(assert (= (str.++  "cdfcbdeecbcddbdafeddeacbfebadbbfbabadbcbdeffccebfbcaf" "")  (str.++  "cdfcbdeecbcddbdafed" B "cbfebadbbfbabadbcbdeffccebfbcaf") ))
(assert (= (str.++  "ecdfebebcafeaffadadbadeafcedfacaceffebdbaaaeafbbccacb" "")  (str.++  "ecdfebebcafeaffadadba" B "fcedfacaceffebdbaaaeafbbccacb") ))
(assert (= (str.++  "bfbafeddabcafffeefdbcfdabdacbcfadeabcebfcfbdafbdaebcd" "")  (str.++  "bfbafeddabcafffeefdbcfdabdacbcfa" B "bcebfcfbdafbdaebcd") ))
(assert (= (str.++  "ebedfddaffcbfab" B "bfbbaeeccdddbcbdbebafffbaadddbacaaf")  (str.++  "ebedfddaffcbfabdeabfbbaeeccdddbcbdbebafffbaadddbacaaf" "") ))
(assert (= (str.++  "dcadbdeadbfefafbeeedf" B "fabcfabfdfdedfeecefdcdfbbdcbf")  (str.++  "dcadb" B "dbfefafbeeedfdeafabcfabfdfdedfeecefdcdfbbdcbf") ))
(assert (= (str.++  "febdbabcdfabffdbcbbc" B "aefbecdacebbdfffccbadbeeccdbcc")  (str.++  "febdbabcdfabffdbcbbcdeaaefbecdacebbdfffccbadbeeccdbcc" "") ))
(assert (= (str.++  "ebeafaeacbcdefcfbdfacdaadcfedecffdbbfbdfaedfeecea" B "b")  (str.++  "ebeafaeacbcdefcfbdfacdaadcfedecffdbbfbdfaedfeecea" B "b") ))
(assert (= (str.++  "dbbdfcdbdcbefeeefacccbfcaadfcafdbde" B "fcdeccbebdeabfd")  (str.++  "dbbdfcdbdcbefeeefacccbfcaadfcafdbdedeafcdeccbeb" B "bfd") ))
(assert (= (str.++  "abfcaafefbdccfdccddad" B "aecbadefafbdaddbfffbfcfebeeed")  (str.++  "abfcaafefbdccfdccddad" B "aecbadefafbdaddbfffbfcfebeeed") ))
(assert (= (str.++  "cecfeebcabfeecfcaebdcddefcfcdeccbadbeaefebbfbeae" B "ab")  (str.++  "cecfeebcabfeecfcaebdcddefcfcdeccbadbeaefebbfbeaedeaab" "") ))
(assert (= (str.++  "eedafcbabadeaafafdebecfeadeafdfabfadabfabbacbfadddcfe" "")  (str.++  "eedafcbaba" B "afafdebecfeadeafdfabfadabfabbacbfadddcfe") ))
(assert (= (str.++  "cedfefebfcdceaddeacceebdfbdbbeebebfdbfbadeceaeaaeadbf" "")  (str.++  "cedfefebfcdcead" B "cceebdfbdbbeebebfdbfbadeceaeaaeadbf") ))
(assert (= (str.++  "aedeeeccaaafdebffbdbfcaccaddcfd" B "cbfbdbbbbaadeeceeec")  (str.++  "aedeeeccaaafdebffbdbfcaccaddcfddeacbfbdbbbbaadeeceeec" "") ))
(assert (= (str.++  "dcedabcbfafcadbfdddacecbbacfccedcebfdcacedeafdceababe" "")  (str.++  "dcedabcbfafcadbfdddacecbbacfccedcebfdcace" B "fdceababe") ))
(assert (= (str.++  "dbcdacdfa" B "beecbaabaabefaeacfdbacdccebaeffacdcaacccd")  (str.++  "dbcdacdfadeabeecbaabaabefaeacfdbacdccebaeffacdcaacccd" "") ))
(assert (= (str.++  "eebaffceafcfddfabbabeeaeffedadcaabbdeadacdffbbaecefab" "")  (str.++  "eebaffceafcfddfabbabeeaeffedadcaabb" B "dacdffbbaecefab") ))
(assert (= (str.++  "dfcacbeeb" B "cdbbcfcaddebdeeecbdbbedcbaeffceeefabfcdaa")  (str.++  "dfcacbeeb" B "cdbbcfcaddebdeeecbdbbedcbaeffceeefabfcdaa") ))
(assert (= (str.++  "edcdeacecfcbbfecaddebded" B "ffdcfaeabadfabefcdbbbecbbe")  (str.++  "edcdeacecfcbbfecaddebdeddeaffdcfaeabadfabefcdbbbecbbe" "") ))
(assert (= (str.++  "afeabacbdeeddffeffadacb" B "dfbbcbeeafacdaeacedfdfefcdd")  (str.++  "afeabacbdeeddffeffadacb" B "dfbbcbeeafacdaeacedfdfefcdd") ))
(assert (= (str.++  "ecddbbfabadcfebdbecdedfcecadfbebdaa" B "ecbfcdafadeddaa")  (str.++  "ecddbbfabadcfebdbecdedfcecadfbebdaa" B "ecbfcdafadeddaa") ))
(assert (= (str.++  "babafabcdedbdceddecfdcbbafbdbcedecbfbeacaadbdb" B "cffb")  (str.++  "babafabcdedbdceddecfdcbbafbdbcedecbfbeacaadbdb" B "cffb") ))
(assert (= (str.++  "ceedcceffaffeccdecccedcffbafcfdcabaeeefdbdbdcddda" B "a")  (str.++  "ceedcceffaffeccdecccedcffbafcfdcabaeeefdbdbdcdddadeaa" "") ))
(assert (= (str.++  "cadecabbfddeaeaceaebfbfdfceefaddabeefabcdbddbbdbdcaab" "")  (str.++  "cadecabbfd" B "eaceaebfbfdfceefaddabeefabcdbddbbdbdcaab") ))
(assert (= (str.++  "aecbddbdcdfcfcbdcefbeacbddfadbbc" B "defaacfcfcabefbdaf")  (str.++  "aecbddbdcdfcfcbdcefbeacbddfadbbcdeadefaacfcfcabefbdaf" "") ))
(assert (= (str.++  "abdfcbecdfadbfdbeacaaaeddfccbeeeabaabedfdff" B "abafdec")  (str.++  "abdfcbecdfadbfdbeacaaaeddfccbeeeabaabedfdffdeaabafdec" "") ))
(assert (= (str.++  "dfbcaadfaeefcaacbfedfbbbfaaaedbfcfcfd" B "decebaccaafce")  (str.++  "dfbcaadfaeefcaacbfedfbbbfaaaedbfcfcfddeadecebaccaafce" "") ))
(assert (= (str.++  "aff" B "decfdefaaefcebfbeabfbfcbafbcbbdcdebebcdadbdebde")  (str.++  "affdeadecfdefaaefcebfbeabfbfcbafbcbbdcdebebcdadbdebde" "") ))
(assert (= (str.++  "cbcebefacfbcdcfd" B "adffeadfbebbdaacdbbbdcbebebdbadaff")  (str.++  "cbcebefacfbcdcfd" B "adffeadfbebbdaacdbbbdcbebebdbadaff") ))
(assert (= (str.++  "feaecabdbffebddecbfdefadabdcddcfbbacdaffafcefddcdeaab" "")  (str.++  "feaecabdbffebddecbfdefadabdcddcfbbacdaffafcefddc" B "ab") ))
(assert (= (str.++  "fcadffdbfdeafcdcabcababbdacdaddca" B "aabafacfbffbdbccf")  (str.++  "fcadffdbfdeafcdcabcababbdacdaddca" B "aabafacfbffbdbccf") ))
(assert (= (str.++  "cdebbceaefdbaacfebfb" B "fefcdcdadfaaedcaeaaaeffeeeacdb")  (str.++  "cdebbceaefdbaacfebfb" B "fefcdcdadfaaedcaeaaaeffeeeacdb") ))
(assert (= (str.++  "feadcdbfeaffcecdefccefddeaccffedaaebaeaedbfbceecddecf" "")  (str.++  "feadcdbfeaffcecdefccefd" B "ccffedaaebaeaedbfbceecddecf") ))
(assert (= (str.++  "fccabddcbbcbcceecfceefecbafadfdaf" B "cdfeadeeecdebcbaa")  (str.++  "fccabddcbbcbcceecfceefecbafadfdafdeacdfeadeeecdebcbaa" "") ))
(assert (= (str.++  "adfbfaaacfffefddbabececbffaebebb" B "ecaaacfffefdbdbebd")  (str.++  "adfbfaaacfffefddbabececbffaebebb" B "ecaaacfffefdbdbebd") ))
(assert (= (str.++  "cbbbacfecfdeadbcceeebedcaeefbbdcdddabfafacbadfbedbddb" "")  (str.++  "cbbbacfecf" B "dbcceeebedcaeefbbdcdddabfafacbadfbedbddb") ))
(assert (= (str.++  "edfdcfafbdeaaaaabcaaba" B "decffdaceddaacbfcfcdfcbcedee")  (str.++  "edfdcfafb" B "aaaabcaabadeadecffdaceddaacbfcfcdfcbcedee") ))
(assert (= (str.++  B "eeeabdebdfacafaafcbcbfabbfedaaeffbebbdbfcccefafaff" "")  (str.++  "deaeeeabdebdfacafaafcbcbfabbfedaaeffbebbdbfcccefafaff" "") ))
(assert (= (str.++  "afccfccfccdadebebbeacafafebddddddcbeceadecf" B "dbcdafd")  (str.++  "afccfccfccdadebebbeacafafebddddddcbeceadecfdeadbcdafd" "") ))
(assert (= (str.++  "ceffabcdfcfadbeadcdceeeffcbcfceb" B "fcafcedb" B "fceceba")  (str.++  "ceffabcdfcfadbeadcdceeeffcbcfcebdeafcafcedbdeafceceba" "") ))
(assert (= (str.++  "bbbeedecbbcbcbcfdbdabadebfdcb" B "bfcbabadeffcacefbbdab")  (str.++  "bbbeedecbbcbcbcfdbdabadebfdcbdeabfcbabadeffcacefbbdab" "") ))
(assert (= (str.++  "aeaadbdafffecdaaafdeaddffeeeadcddcbeacfbedebadeedfdda" "")  (str.++  "aeaadbdafffecdaaaf" B "ddffeeeadcddcbeacfbedebadeedfdda") ))
(assert (= (str.++  "bffffbfcfaaadfcbfbdcfbcdcdaafcddddacbaccaabac" B "fcfee")  (str.++  "bffffbfcfaaadfcbfbdcfbcdcdaafcddddacbaccaabac" B "fcfee") ))
(check-sat)

(exit)

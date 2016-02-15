import java.util.HashMap;

/**
 * Created by narxeba on 2/9/16.
 */
public class Test {

    public static void main(String[] args) {
        String test = "Tsha-tsu";
        String result = toHiragana(test);
        System.out.print(result);
    }

    private static HashMap<String, String> sMap;

    public static String toHiragana(String x) {
        if (sMap == null) {
            sMap = new HashMap<>();
            sMap.put("a", "あ");
            sMap.put("i", "い");
            sMap.put("u", "う");
            sMap.put("e", "え");
            sMap.put("o", "お");
            sMap.put("yi", "い");
            sMap.put("wu", "う");
            sMap.put("whu", "う");
            sMap.put("xa", "ぁ");
            sMap.put("xi", "ぃ");
            sMap.put("xu", "ぅ");
            sMap.put("xe", "ぇ");
            sMap.put("xo", "ぉ");
            sMap.put("xyi", "ぃ");
            sMap.put("xye", "ぇ");
            sMap.put("ye", "いぇ");
            sMap.put("wha", "うぁ");
            sMap.put("whi", "うぃ");
            sMap.put("whe", "うぇ");
            sMap.put("who", "うぉ");
            sMap.put("wi", "うぃ");
            sMap.put("we", "うぇ");
            sMap.put("va", "ゔぁ");
            sMap.put("vi", "ゔぃ");
            sMap.put("vu", "ゔ");
            sMap.put("ve", "ゔぇ");
            sMap.put("vo", "ゔぉ");
            sMap.put("vya", "ゔゃ");
            sMap.put("vyi", "ゔぃ");
            sMap.put("vyu", "ゔゅ");
            sMap.put("vye", "ゔぇ");
            sMap.put("vyo", "ゔょ");
            sMap.put("ka", "か");
            sMap.put("ki", "き");
            sMap.put("ku", "く");
            sMap.put("ke", "け");
            sMap.put("ko", "こ");
            sMap.put("lka", "ヵ");
            sMap.put("lke", "ヶ");
            sMap.put("xka", "ヵ");
            sMap.put("xke", "ヶ");
            sMap.put("kya", "きゃ");
            sMap.put("kyi", "きぃ");
            sMap.put("kyu", "きゅ");
            sMap.put("kye", "きぇ");
            sMap.put("kyo", "きょ");
            sMap.put("ca", "か");
            sMap.put("ci", "き");
            sMap.put("cu", "く");
            sMap.put("ce", "け");
            sMap.put("co", "こ");
            sMap.put("lca", "ヵ");
            sMap.put("lce", "ヶ");
            sMap.put("xca", "ヵ");
            sMap.put("xce", "ヶ");
            sMap.put("qya", "くゃ");
            sMap.put("qyu", "くゅ");
            sMap.put("qyo", "くょ");
            sMap.put("qwa", "くぁ");
            sMap.put("qwi", "くぃ");
            sMap.put("qwu", "くぅ");
            sMap.put("qwe", "くぇ");
            sMap.put("qwo", "くぉ");
            sMap.put("qa", "くぁ");
            sMap.put("qi", "くぃ");
            sMap.put("qe", "くぇ");
            sMap.put("qo", "くぉ");
            sMap.put("kwa", "くぁ");
            sMap.put("qyi", "くぃ");
            sMap.put("qye", "くぇ");
            sMap.put("ga", "が");
            sMap.put("gi", "ぎ");
            sMap.put("gu", "ぐ");
            sMap.put("ge", "げ");
            sMap.put("go", "ご");
            sMap.put("gya", "ぎゃ");
            sMap.put("gyi", "ぎぃ");
            sMap.put("gyu", "ぎゅ");
            sMap.put("gye", "ぎぇ");
            sMap.put("gyo", "ぎょ");
            sMap.put("gwa", "ぐぁ");
            sMap.put("gwi", "ぐぃ");
            sMap.put("gwu", "ぐぅ");
            sMap.put("gwe", "ぐぇ");
            sMap.put("gwo", "ぐぉ");
            sMap.put("sa", "さ");
            sMap.put("si", "し");
            sMap.put("shi", "し");
            sMap.put("su", "す");
            sMap.put("se", "せ");
            sMap.put("so", "そ");
            sMap.put("za", "ざ");
            sMap.put("zi", "じ");
            sMap.put("zu", "ず");
            sMap.put("ze", "ぜ");
            sMap.put("zo", "ぞ");
            sMap.put("ji", "じ");
            sMap.put("sya", "しゃ");
            sMap.put("syi", "しぃ");
            sMap.put("syu", "しゅ");
            sMap.put("sye", "しぇ");
            sMap.put("syo", "しょ");
            sMap.put("sha", "しゃ");
            sMap.put("shu", "しゅ");
            sMap.put("she", "しぇ");
            sMap.put("sho", "しょ");
            sMap.put("shya", "しゃ");
            sMap.put("shyu", "しゅ");
            sMap.put("shye", "しぇ");
            sMap.put("shyo", "しょ");
            sMap.put("swa", "すぁ");
            sMap.put("swi", "すぃ");
            sMap.put("swu", "すぅ");
            sMap.put("swe", "すぇ");
            sMap.put("swo", "すぉ");
            sMap.put("zya", "じゃ");
            sMap.put("zyi", "じぃ");
            sMap.put("zyu", "じゅ");
            sMap.put("zye", "じぇ");
            sMap.put("zyo", "じょ");
            sMap.put("ja", "じゃ");
            sMap.put("ju", "じゅ");
            sMap.put("je", "じぇ");
            sMap.put("jo", "じょ");
            sMap.put("jya", "じゃ");
            sMap.put("jyi", "じぃ");
            sMap.put("jyu", "じゅ");
            sMap.put("jye", "じぇ");
            sMap.put("jyo", "じょ");
            sMap.put("ta", "た");
            sMap.put("ti", "ち");
            sMap.put("tu", "つ");
            sMap.put("te", "て");
            sMap.put("to", "と");
            sMap.put("chi", "ち");
            sMap.put("tsu", "つ");
            sMap.put("ltu", "っ");
            sMap.put("xtu", "っ");
            sMap.put("tya", "ちゃ");
            sMap.put("tyi", "ちぃ");
            sMap.put("tyu", "ちゅ");
            sMap.put("tye", "ちぇ");
            sMap.put("tyo", "ちょ");
            sMap.put("cha", "ちゃ");
            sMap.put("chu", "ちゅ");
            sMap.put("che", "ちぇ");
            sMap.put("cho", "ちょ");
            sMap.put("cya", "ちゃ");
            sMap.put("cyi", "ちぃ");
            sMap.put("cyu", "ちゅ");
            sMap.put("cye", "ちぇ");
            sMap.put("cyo", "ちょ");
            sMap.put("chya", "ちゃ");
            sMap.put("chyu", "ちゅ");
            sMap.put("chye", "ちぇ");
            sMap.put("chyo", "ちょ");
            sMap.put("tsa", "つぁ");
            sMap.put("tsi", "つぃ");
            sMap.put("tse", "つぇ");
            sMap.put("tso", "つぉ");
            sMap.put("tha", "てゃ");
            sMap.put("thi", "てぃ");
            sMap.put("thu", "てゅ");
            sMap.put("the", "てぇ");
            sMap.put("tho", "てょ");
            sMap.put("twa", "とぁ");
            sMap.put("twi", "とぃ");
            sMap.put("twu", "とぅ");
            sMap.put("twe", "とぇ");
            sMap.put("two", "とぉ");
            sMap.put("da", "だ");
            sMap.put("di", "ぢ");
            sMap.put("du", "づ");
            sMap.put("de", "で");
            sMap.put("do", "ど");
            sMap.put("dya", "ぢゃ");
            sMap.put("dyi", "ぢぃ");
            sMap.put("dyu", "ぢゅ");
            sMap.put("dye", "ぢぇ");
            sMap.put("dyo", "ぢょ");
            sMap.put("dha", "でゃ");
            sMap.put("dhi", "でぃ");
            sMap.put("dhu", "でゅ");
            sMap.put("dhe", "でぇ");
            sMap.put("dho", "でょ");
            sMap.put("dwa", "どぁ");
            sMap.put("dwi", "どぃ");
            sMap.put("dwu", "どぅ");
            sMap.put("dwe", "どぇ");
            sMap.put("dwo", "どぉ");
            sMap.put("na", "な");
            sMap.put("ni", "に");
            sMap.put("nu", "ぬ");
            sMap.put("ne", "ね");
            sMap.put("no", "の");
            sMap.put("nya", "にゃ");
            sMap.put("nyi", "にぃ");
            sMap.put("nyu", "にゅ");
            sMap.put("nye", "にぇ");
            sMap.put("nyo", "にょ");
            sMap.put("ha", "は");
            sMap.put("hi", "ひ");
            sMap.put("hu", "ふ");
            sMap.put("he", "へ");
            sMap.put("ho", "ほ");
            sMap.put("fu", "ふ");
            sMap.put("hya", "ひゃ");
            sMap.put("hyi", "ひぃ");
            sMap.put("hyu", "ひゅ");
            sMap.put("hye", "ひぇ");
            sMap.put("hyo", "ひょ");
            sMap.put("fya", "ふゃ");
            sMap.put("fyu", "ふゅ");
            sMap.put("fyo", "ふょ");
            sMap.put("fwa", "ふぁ");
            sMap.put("fwi", "ふぃ");
            sMap.put("fwu", "ふぅ");
            sMap.put("fwe", "ふぇ");
            sMap.put("fwo", "ふぉ");
            sMap.put("fa", "ふぁ");
            sMap.put("fi", "ふぃ");
            sMap.put("fe", "ふぇ");
            sMap.put("fo", "ふぉ");
            sMap.put("fyi", "ふぃ");
            sMap.put("fye", "ふぇ");
            sMap.put("ba", "ば");
            sMap.put("bi", "び");
            sMap.put("bu", "ぶ");
            sMap.put("be", "べ");
            sMap.put("bo", "ぼ");
            sMap.put("bya", "びゃ");
            sMap.put("byi", "びぃ");
            sMap.put("byu", "びゅ");
            sMap.put("bye", "びぇ");
            sMap.put("byo", "びょ");
            sMap.put("pa", "ぱ");
            sMap.put("pi", "ぴ");
            sMap.put("pu", "ぷ");
            sMap.put("pe", "ぺ");
            sMap.put("po", "ぽ");
            sMap.put("pya", "ぴゃ");
            sMap.put("pyi", "ぴぃ");
            sMap.put("pyu", "ぴゅ");
            sMap.put("pye", "ぴぇ");
            sMap.put("pyo", "ぴょ");
            sMap.put("ma", "ま");
            sMap.put("mi", "み");
            sMap.put("mu", "む");
            sMap.put("me", "め");
            sMap.put("mo", "も");
            sMap.put("mya", "みゃ");
            sMap.put("myi", "みぃ");
            sMap.put("myu", "みゅ");
            sMap.put("mye", "みぇ");
            sMap.put("myo", "みょ");
            sMap.put("ya", "や");
            sMap.put("yu", "ゆ");
            sMap.put("yo", "よ");
            sMap.put("xya", "ゃ");
            sMap.put("xyu", "ゅ");
            sMap.put("xyo", "ょ");
            sMap.put("ra", "ら");
            sMap.put("ri", "り");
            sMap.put("ru", "る");
            sMap.put("re", "れ");
            sMap.put("ro", "ろ");
            sMap.put("rya", "りゃ");
            sMap.put("ryi", "りぃ");
            sMap.put("ryu", "りゅ");
            sMap.put("rye", "りぇ");
            sMap.put("ryo", "りょ");
            sMap.put("la", "ら");
            sMap.put("li", "り");
            sMap.put("lu", "る");
            sMap.put("le", "れ");
            sMap.put("lo", "ろ");
            sMap.put("lya", "りゃ");
            sMap.put("lyi", "りぃ");
            sMap.put("lyu", "りゅ");
            sMap.put("lye", "りぇ");
            sMap.put("lyo", "りょ");
            sMap.put("wa", "わ");
            sMap.put("wo", "を");
            sMap.put("lwe", "ゎ");
            sMap.put("xwa", "ゎ");
            sMap.put("n", "ん");
            sMap.put("n ", "ん");
            sMap.put("xn", "ん");
            sMap.put("ltsu", "っ");
        }

        char[] ch = x.toLowerCase().toCharArray();
        String str, temp;
        String vowel = "aiueo";
        String vowelWithSpace = "aiueo ";
        StringBuilder outputBuilder = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            str = "" + ch[i];
            if (ch[i] == 'n') {
                if ((i < x.length() - 1) && vowelWithSpace.indexOf(ch[i+1]) >= 0) {
                    str = str + ch[i + 1];
                    i++;
                }
                if ((i < x.length() - 2) && (ch[i + 1] == 'y') && vowel.indexOf(ch[i+2]) >= 0) {
                    str = str + ch[i + 1] + ch[i + 2];
                    i += 2;
                }
            }
            if (i != x.length() - 1 && isCompound(ch[i], ch[i + 1])) {
                outputBuilder.append('っ');
                i++;
            }

//            temp = sMap.get(str);
//            if (temp != null) {
//                outputBuilder.append(temp);
//            } else {
//                if (i < x.length() - 1) {
//                    str = str + ch[i + 1];
//                    temp = sMap.get(str);
//                    if (temp != null) {
//                        outputBuilder.append(temp);
//                        i++;
//                    } else {
//                        if (i < x.length() - 2) {
//                            str = str + ch[i + 2];
//                            temp = sMap.get(str);
//                            if (temp != null) {
//                                outputBuilder.append(temp);
//                                i = i + 2;
//                            } else {
//                                if (i < x.length() - 3) {
//                                    str = str + ch[i + 3];
//                                    temp = sMap.get(str);
//                                    if (temp != null) {
//                                        outputBuilder.append(temp);
//                                        i = i + 3;
//                                    } else {
//                                        outputBuilder.append(ch[i]);
//                                    }
//                                } else {
//                                    outputBuilder.append(ch[i]);
//                                }
//                            }
//                        } else {
//                            outputBuilder.append(ch[i]);
//                        }
//                    }
//                } else {
//                    outputBuilder.append(ch[i]);
//                }
//            }
            i = convertCharacter(str, outputBuilder, i, x.length(), ch, 0);
        }

        return outputBuilder.toString().trim();
    }

    private static final String TEST_COMPOUND = "qwrtypsdfghjklzxcvbm";

    private static boolean isCompound(char i, char j) {
        return (i == j) && (TEST_COMPOUND.indexOf(i) != -1);
    }

    private static int convertCharacter(String str, StringBuilder outputBuilder, int i,
                                           int length, char[] ch, int loop) {
        String temp = sMap.get(str);
        if (temp != null) {
            outputBuilder.append(temp);
            i += loop;
        } else {
            if (loop < 4) {
                if (i < length - loop - 1) {
                    str += ch[i + loop + 1];
                    return convertCharacter(str, outputBuilder, i, length, ch, ++loop);
                } else {
                    outputBuilder.append(ch[i]);
                }
            } else {
                outputBuilder.append(ch[i]);
            }
        }
        return i;
    }
}

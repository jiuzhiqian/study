package xin.jiuzhiqian.study.leetcode;


import java.util.*;

/**
 * @author : feng
 */
public class Day21Solution {

    public static void main(String[] args) {
        Day21Solution solution = new Day21Solution();
        // int[] arr = {6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2, 4, 8, 1, 9, 5, 4, 3, 8, 5, 10, 8, 6, 6, 1, 0, 6, 10, 8, 2, 3, 4};
        // int[] arr = {6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0};
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 9, 2, 19, 7};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        String[] queries = {"b", "baaabbabb", "baabba", "abaababa", "bbaa", "bbaa", "b", "baaa", "aba", "baabbaab", "abaaab", "aaabaaba", "abababa", "babaabaab", "ba", "aaabbb", "bb", "aabba", "abbaaaaa", "abbabaabaa", "abbab", "ba", "bbb", "abbb", "bababbab", "babbb", "bbabbb", "bababaabbb", "aaabbaba", "bb", "baa", "babaaaab", "aaabaa", "babaaa", "bbbabaabba", "bbabaab", "aaaba", "bbbb", "bbbbaaabb", "abb", "aaa", "bba", "bba", "aa", "babbaaa", "bbbba", "b", "abbaaba", "aaa", "baaabbb", "aabba", "bbabababa", "bbaaabaa", "baaa", "ba", "aba", "bbbaba", "aabbbb", "bbbaaabaa", "bbbbbab", "a", "aab", "aaabb", "abbaaababb", "baaaa", "ababb", "aabbbbbbb", "abbaabb", "abababbaa", "a", "baabaa", "babbabab", "aabaababbb", "baaba", "ab", "b", "bbaaba", "bbba", "b", "bbbabbabab", "baabbbaaba", "abaaabbb", "baaaabb", "babaaba", "b", "abba", "baa", "aaaaabaabb", "aaabaabab", "ba", "ba", "ababbb", "babbbb", "aba", "abaabbabbb", "babbbba", "aaaaabbaba", "bbbaabb", "bbaba", "babbaaaaa", "baaa", "aabaaab", "bbb", "abbbba", "abbbaaa", "baba", "aaaabab", "aaabb", "aababbabb", "aaaabbba", "aaaabab", "baab", "aa", "bababbabb", "b", "abbbab", "bbbabaabaa", "b", "aaabba", "aaab", "aaaab", "aaabaabaab", "baababbaba", "ba", "abb", "abaaa", "babbbb", "aaaaababb", "bbbba", "bbbbb", "babbbbbbab", "a", "abaaabaa", "bbab", "baba", "abbaa", "a", "ababaabab", "baabbaaaa", "aaaa", "abaabbbbb", "aab", "bbbbbbba", "b", "babb", "aaabbaabab", "b", "baaabab", "ababbba", "aabbabbbba", "baaaaba", "bbba", "ab", "b", "bbbaaba", "aababbaa", "bbbbaabbaa", "bbbaaaaaba", "baabbbabb", "baba", "ba", "abbaabaa", "abaaaaa", "b", "aabbbbba", "babaaba", "aa", "baabbbab", "aababbbb", "bbab", "bbaaabbbaa", "aabbbabaaa", "bbaaabbb", "aa", "baabbbbbaa", "babbbb", "abbbbaab", "bb", "abaaabb", "a", "baaa", "bbaabaaaa", "a", "bab", "bbbabaaaaa", "aabbb", "abaa", "a", "baababba", "bb", "aaa", "aaaaabaaba", "abaaaabbb", "babb", "bab", "b", "bb", "ba", "abaaaba", "b", "babaa", "baaaabba", "ababbaaaa", "aaa", "abbabba", "babbaa", "babbbabbab", "aaaabb", "aaaabbbab", "bb", "aabaabbb", "baaaa", "bbbbbaaba", "bbba", "abaaa", "bbbba", "aba", "baabbabbb", "aba", "bbabbbbab", "bbb", "bbabbbaab", "babbabaabb", "bbabbbabb", "b", "aa", "b", "abaaabaa", "baabaaaab", "abbaab", "aabbbbab", "aba", "aaba", "bbbbb", "bbaab", "aabababb", "bbbb", "bbaaaa", "aaabb", "bbaababab", "baabb", "a", "ababab", "abbabba", "abbabba", "b", "ababa", "baababb", "aaaabab", "babb", "babaab", "abb", "aaa", "baaabbabbb", "aaaaabbba", "aaaababaaa", "baabbbbab", "abbbbaaa", "abba", "baaabaabbb", "bbbba", "bbaababbb", "ababbaab", "a", "abb", "ababaaab", "aaba", "a", "aba", "aaabb", "babbba", "baa", "ba", "ba", "bbaaa", "abaabbabaa", "aabbb", "abab", "bbaba", "aaa", "aababb", "bbbaba", "aaaaabab", "bbaab", "aaababb", "bbbb", "babba", "aba", "abaaabbaaa", "baabbaab", "a", "b", "abbbaaaba", "bbaababab", "ba", "abbababbbb", "baaab", "aa", "ababbaab", "bbbaaaba", "abbbbbbaba", "bbb", "aabba", "bbaaababa", "abaaabaaa", "aa", "b", "abbbaba", "abaababa", "bbabbab", "babbba", "bab", "abb", "bbaabbb", "baababa", "aabbb", "ba", "abababba", "abaabbabaa", "bba", "bb", "aab", "aabba", "abbba", "bababaaaab", "aa", "baa", "aaaaababab", "abbab", "bbba", "ba", "baabaaabb", "aabbbabb", "a", "baabaaaa", "aabbaabaab", "baaaaaa", "bbaa", "baaaabbb", "ba", "bbbaaaa", "babab", "baaa", "bb", "ba", "bbbbaab", "ababbbbaa", "aaaaabbbb", "bbbba", "ababbababb", "baa", "a", "bbba", "aa", "baabab", "abab", "bbabbabbb", "aa", "bba", "bbabbabbb", "b", "baabbbbb", "abaaaaaaa", "bbaaaabbbb", "abba", "a", "abbababb", "aababbaba", "aabbbbbab", "abbbbbabab", "bbb", "baaababaa", "bbb", "abba", "aaaba", "babab", "bbaabaa", "b", "bbbbbbbbaa", "bbbbaabba", "ba", "ab", "aaaba", "bbb", "bbb", "ba", "bb", "bbbbbaaba", "aaaaa", "a", "bbab", "aa", "bbbbaabbb", "aabbabbb", "ab", "aabb", "bbbb", "babbaaa", "ab", "bb", "abba", "abbabbaaba", "abaabba", "babab", "baaaaaaa", "abaaaaaaaa", "babaab", "aaaabab", "abbb", "aa", "bbb", "bbaabbb", "abbbabaa", "bbab", "bb", "aabbb", "a", "abb", "abbababaab", "baaba", "bb", "bbaabbaa", "aaab", "b", "babba", "aabaaababa", "a", "b", "baa", "abbbbabaa", "abb", "abbaa", "abbba", "abbba", "babbab", "abbb", "aabbb", "bbbbab", "aaabba", "aaaab", "bab", "abbb", "aabbabbb", "baabaaaab", "aabaa", "aabbbabaa", "baba", "aaaaaba", "baaba", "babaaaabb", "abbbb", "ababa", "aabab", "bab", "aabbb", "bbbabbaaab", "abbababbbb", "babbab", "baab", "abba", "baabbab", "aaabaabb", "abbbbbaab", "ababaabaa", "b", "bbbbbbbaaa", "ababb", "ababbabba", "ab", "baaabaa", "abbabaa", "baaabaabab", "bbbbbababb", "aaa", "abaa", "baaabaaaa", "bbabab", "b", "ababaab", "baabbbbaa", "aaab", "baababab", "aabba", "baaabaaa", "aaaabbba", "aaaa", "a", "aaaaaabb", "bb", "bbaaaabbb", "babbbab", "abaaabbb", "aab", "bbbbba", "ababbbaaa", "ababaaaa", "aabab", "bba", "bbbbaaa", "a", "abbb", "aba", "ba", "bbbaaa", "ab", "abaabbba", "ba", "aaaab", "abbbb", "bbbabaaaba", "ababb", "aaaaabbaba", "abbb", "abbaa", "bbbabbaba", "baaaaaaa", "bb", "bbaabbabb", "abbabbb", "bbbbabba", "bbbbaabaa", "abaa", "aaabbbbaab", "baabbabaa", "bb", "aaabbababa", "abbbaababa", "baa", "aabab", "bbaabaa", "aaaaaa", "abb", "a", "aabb", "babbaa", "aaaaabbb", "babbb", "bb", "aaab", "baabbabaa", "baaababbab", "bbabbb", "a", "a", "aabbbba", "b", "bbbb", "bbbabbb", "bbb", "aaabb", "bb", "aaa", "babbabbbb", "bbbaaa", "aa", "a", "baba", "aaaba", "aa", "a", "aba", "babbaaba", "bbab", "bbaa", "abbbbbaba", "bbaaabbb", "aaabbabbab", "aabaaaaaa", "a", "aabb", "ba", "b", "abaaba", "b", "abaaaa", "bbabaabbbb", "a", "aaaaa", "bbab", "bbabbbbbb", "bbbbb", "bbbbbba", "a", "bababa", "bbaabbaabb", "aabbbbaa", "bbaabbaa", "ba", "abbba", "aa", "babbbabaaa", "b", "aababaaa", "aaa", "aab", "baabbaab", "bbbba", "ab", "bbbaabb", "aaaabb", "babaaa", "bbbaaabba", "aabba", "babbbb", "abaabbbaab", "aaabab", "abababba", "abababb", "aaaa", "bbaaabaa", "ababb", "aaaaaab", "bbaabbaaba", "bbbbab", "bbaab", "bbaaa", "bbbbbabbb", "bbab", "abbbbbba", "aabb", "bbbab", "abbab", "bbbbabb", "bb", "a", "bababab", "aaa", "abba", "b", "bbababaaba", "aaabaabbbb", "bba", "bb", "aa", "baaaaaaab", "b", "b", "aaaaaaaaba", "babbaaa", "bbab", "aaabbb", "abb", "b", "b", "baaa", "aaaab", "aaaabb", "baab", "aabbbbaa", "abaababab", "bbaa", "bb", "bbb", "aa", "b", "bbaaa", "bababbaa", "b", "abbabbaaab", "babbbb", "bbaabbaab", "abaabbaab", "bbbbbbaaa", "aabb", "ba", "abaa", "a", "bbaabbabaa", "babaaaaaaa", "babaabbaba", "baaabbaab", "babbbbb", "abbabb", "bb", "baba", "bbababb", "bababaa", "abbba", "bbababab", "ba", "bbbbab", "a", "bb", "bbab", "baab", "bbbbbbaaab", "bba", "abbaab", "abbbabaaa", "abbba", "a", "a", "baa", "babab", "babb", "bb", "ab", "aabbaa", "abbba", "ba", "abbaaa", "baa", "bbbbabb", "aab", "a", "abbbababbb", "baabaaabba", "b", "abaaa", "babaa", "bbbbaaa", "baa", "abbbbba", "bbbbbbba", "abaa", "baaaabaabb", "bbabbbbbab", "babbbaabaa", "abbababba", "abbbbbbab", "bbaaaaaaaa", "aabbbbab", "bbbbaa", "ababbaba", "aabbbabbbb", "abbaa", "a", "bb", "abb", "abaabab", "bbbbaabbbb", "bbaabbb", "babaaabba", "ba", "abbbaa", "a", "bbbbabbab", "bababababa", "abbb", "bbabaaaab", "abaaab", "bb", "abbba", "abbbbaab", "abaa", "aaaabbbab", "bbabaa", "abababa", "aa", "babaa", "aa", "bbbba", "bbabbababb", "bbabbaabb", "a", "a", "bbaaab", "abaabba", "abbab", "bab", "aaaaa", "abaaba", "bbbbaabbb", "abaaa", "abbabbb", "a", "babaabaa", "aabbbbbbb", "a", "aabab", "aaabaabbba", "ab", "baabaaab", "b", "bbabbaab", "bb", "aaababb", "aabababb", "bababbabb", "b", "aaa", "bbbab", "abba", "b", "aaaaab", "babab", "bbaa", "a", "aa", "abbaabb", "aaabbab", "ababb", "abab", "aba", "aab", "aabb", "abbbbbba", "bb", "aaa", "ab", "aaabaa", "aabbab", "bbbbaaab", "aaaabba", "b", "abaaaab", "aaababb", "abaaa", "baabbaa", "babaaa", "aaaaa", "aababbbbb", "aaab", "abbbbaba", "abbbabbb", "bbb", "abaabab", "bbaaabbaa", "baaaaaaba", "bbababb", "bbabbaba", "abaaab", "abbbaaa", "aaabbb", "abb", "babbaab", "bbbaba", "a", "abbababb", "bb", "bbbb", "baabaaaab", "bb", "b", "ababbbbbaa", "ba", "bbbb", "baab", "aaabbbabb", "baaaaab", "abbaabab", "abbaaa", "aabaab", "ab", "a", "aaaa", "aabb", "abbb", "b", "a", "aa", "b", "bbbbaabb", "abbabaab", "ba", "babaabab", "bb", "baaabab", "baabaab", "bbaaaaabba", "abbbb", "babbbbaa", "abbbaabb", "ababbba", "abbbba", "bbab", "bbbaaabbaa", "b", "abab", "aaaaaaabba", "bbaaabb", "aababbbbb", "abb", "aabaaabb", "aa", "abbba", "bbabbbaaa", "bbabaab", "abba", "baaab", "aababbbaab", "babaabbab", "bbabbbba", "aaba", "a", "bbabaaa", "aaba", "aa", "bbab", "ba", "bb", "b", "baab", "b", "bbbbbb", "aab", "ababb", "a", "a", "baaa", "abba", "bbbaaabba", "baabaa", "baabaaaba", "bbbbbab", "baaabbbb", "bababbbab", "bbaaaaaaaa", "baaa", "baaba", "abb", "baabbbbbbb", "ababaabbba", "a", "bbab", "bbbbabaabb", "bb", "aabbababaa", "bb", "abbbbab", "ab", "a", "bbabbb", "aaaabaab", "babbbaa", "bbabb", "bbbbbbab", "babbabbb", "b", "bbababbba", "babbbba", "aaaaaa", "aab", "aabaaabba", "baa", "a", "b", "bbbbaba", "ababbab", "bbbb", "bbabbaaba", "abbbbabb", "aababbb", "abbb", "aababbbaa", "abab", "baba", "abaaaababb", "abb", "aaabaababb", "aaaab", "bbb", "bbaaa", "bbaba", "bbaaaaba", "baaaaa", "aaabaa", "aaaaaabba", "aaaaabb", "aaa", "aaaa", "aabbab", "aab", "abbab", "ababab", "baabbaabaa", "baaaaaaabb", "baababbab", "babbaa", "abaabbbab", "abab", "abba", "bbabbbaba", "bbbbbab", "bbbbab", "bb", "b", "abbb", "bbababaa", "baabaaa", "b", "bbbba", "bbbbbab", "babab", "bbaaaba", "abbbaaaba", "bbaba", "aababba", "aa", "baba", "bab", "bbaababa", "aa", "bbaabba", "bbbba", "aabbabaa", "bbaaababa", "bbaaabb", "b", "aa", "aaaa", "abb", "abaaaababa", "abab", "abaaaaab", "abbbaabaab", "ab", "baaaba", "a", "aaaaba", "bbaaaa", "ab", "babbbbbbaa", "a", "b", "aaaabaab", "ba", "aba", "bbaba", "aaaaabaab", "baaabab", "baaaabba", "baaabb", "aaa", "aabaa", "bbabb", "ab", "baabbb", "ababbabbab", "bbabbbab", "aaaba", "aaabaa", "baabbb", "abbb", "bab", "abaab", "abbaaaaaaa", "abbabbbba", "aaa", "babbaabb", "aabaabaab", "aaa", "a", "aabbaaab", "babaaaabab", "ba", "b", "baababa", "bbabbbabaa", "ababb", "aaaaabaaba", "baaabbaaab", "aa", "aaabbbbaaa", "bab", "abbbbb", "aaaa", "a", "abaa", "bbbabbbbba", "aab", "a", "aaab", "bb", "abbaaabbb", "a", "bbbb", "aaaaba", "bbbaaabbaa", "ababba", "bbbabaaab", "bbbbaab", "aaaaaaabab", "abb", "bb", "abb", "babbbbaab", "abbbabbbb", "abaaaaaa", "bbba", "bbbab", "bbbabaaaba", "abababb", "babb", "abbbbbb", "ba", "bbbaaba", "b", "bbbbabaaa", "bbbb", "bbbbab", "babbba", "abbb", "bbaaaaaaa", "babbbaabb", "abbaba", "b", "bbbabaaaab", "abbbbbb", "aaaba", "baaaba", "ba", "bab", "aabbbbabb", "b", "aabb", "bb", "b", "ababaab", "abbabbbba", "baaabbbb", "aaabb", "abaabab", "ababbb", "baabb", "aaabb", "bbaaabbbb", "baa", "abaab", "a", "aaaababb", "aaabba", "aabababa", "ba", "bbb", "ab", "aaabbbbbb", "a", "bbbaa", "ababaaaaa", "babbbaaa", "aba", "baaaba", "b", "aabaaab", "aaaababb", "aabbbba", "bbabaa", "bbaab", "bba", "ba", "ababbbbab", "aabaaa", "aba", "ba", "b", "bbaaa", "abaa", "aaabababb", "baaabaaab", "abab", "aaaaaaaaaa", "aba", "abb", "ba", "bbba", "ab", "babaabaaaa", "bbbabbab", "a", "bbbbbaaa", "babaaa", "abaa", "abb", "bbaa", "aaab", "baaa", "baaaabb", "abaaababbb", "aabbaabaaa", "bba", "abbabbbbaa", "a", "aaabbbaabb", "baabbabaa", "bbbaa", "abb", "bbaaab", "bbabbbbbab", "abbaa", "abbb", "ba", "aaabab", "baaab", "ab", "aaaabb", "baa", "aa", "aaaabaab", "a", "bba", "baaaa", "aaaab", "bbbbaaba", "a", "ab", "baabaa", "a", "aab", "a", "ab", "abbb", "ba", "baaba", "bababbaa", "bbbbaabb", "bbababbabb", "b", "baabbbbaab", "bbabba", "baabb", "abaaa", "b", "bbbbb", "baaaabbb", "baab", "bbaaa", "a", "baa", "aaababb", "aaabbbab", "bbaaaba", "bb", "baba", "aaabaabb", "bbbabb", "abaabaaa", "aabaabaa", "ababab", "bbbbb", "aabbbabbb", "aa", "bbbab", "bb", "aaabb", "baa", "bbaaba", "baab", "baaaabbaab", "abbaab", "aabaa", "abaabaabba", "bba", "aaabab", "bbaaaababb", "bbabbaabab", "aaaaababba", "babaa", "babbb", "aa", "aa", "ababaaaba", "abababba", "baaaaabba", "bbbbab", "a", "bbabaaabb", "bbbababbb", "b", "ba", "bbbb", "aabababa", "abaa", "bbbaabbbbb", "babaaaa", "aaaaaabba", "bababbb", "abaaa", "aaaa", "bbbaab", "bbbaaaaaab", "abaababba", "bababbbbaa", "aaabaaaaaa", "aba", "baabbbbb", "aaabbabb", "abab", "bb", "bbba", "aabbba", "aaabaabba", "abaa", "abbabba", "ab", "baaabab", "bbaa", "ababbab", "baab", "ab", "abbbb", "baababbb", "abbbaaaaba", "abaaaabaa", "aaaababaaa", "aaabbbbaa", "abbaaaaaba", "aa", "a", "bb", "bbab", "bbbaba", "a", "baaaaa", "a", "abbaaab", "a", "aabbaaaa", "abaaabbb", "aa", "ababa", "bbaabbb", "abbab", "bbbabbab", "aa", "bba", "bababaaa", "aba", "ababa", "aab", "aaa", "bbbb", "b", "baaababbb", "ab", "ba", "b", "bb", "bbbbbbbaba", "aaabbbaab", "aaa", "a", "abbabbb", "babbaaaaa", "aa", "abababba", "b", "ababbaa", "baba", "aaa", "babbbab", "babaaaaabb", "baaa", "b", "aabbbb", "abbbaaa", "abbabbb", "aaabbbbaab", "bbaa", "baaa", "b", "aaabababa", "bbaa", "abbaaa", "bbbbabaaa", "ababaabba", "bbbba", "abbab", "bb", "abbbba", "bbaabba", "abbbbba", "baa", "aba", "bbabab", "a", "bbbaa", "bbaba", "babbaa", "babbaaaba", "a", "aabaa", "bbbbbaaab", "abababaaab", "bbbab", "abaaaaabb", "aaababaa", "bbaabb", "aba", "ababbab", "abbaabaab", "bba", "aaaab", "abbbabb", "aaaaab", "bbbabbbbb", "ba", "a", "bababbaaa", "babaaba", "aabbbbbbab", "baa", "abaa", "bababbaaaa", "abbbaabaab", "b", "abbbabb", "bbbbaaa", "aaababb", "baabbaaba", "b", "bb", "aabb", "babbbab", "abb", "a", "bbb", "abab", "babbbabb", "babaab", "baaaba", "babbba", "bbbbbaa", "b", "abbaababa", "abaaabab", "b", "abbbaabbab", "aabbaaab", "bbbb", "a", "abbbaabb", "aabbbabaa", "bbbbaabbb", "bba", "aaababbba", "bb", "bbabbbaa", "aa", "bb", "bab", "bbb", "bbaaaabbba", "aaaabbaa", "abbababba", "abbbaba", "aabbba", "bbbbaa", "ababbba", "bbbbb", "ab", "abba", "aaa", "abb", "aaaabbaa", "aababaabbb", "baaaaba", "aaaa", "bbbbaabab", "babaabaa", "baaaaa", "abab", "abaabbba", "baaa", "aabaababa", "aabbabb", "bbbaaabaa", "bbbbaaaa", "aab", "babaabbaab", "b", "aaabaaabb", "abaabaaaa", "ba", "bb", "bbab", "baa", "babbaab", "babab", "aaabba", "aabba", "aaa", "ba", "a", "aaababa", "babbbba", "bbaaaabb", "aab", "aaaabba", "aaabbab", "b", "aabababbab", "bbaaaaabab", "baab", "aa", "ba", "babaababab", "a", "baabaaab", "b", "bbaabaabba", "abbabb", "abbbba", "baaabb", "bbbaaaabba", "aaababa", "bbaaba", "bb", "bbaaabb", "bbbaaa", "ababbb", "ababaa", "aaabaaabb", "aabbabb", "ababb", "aaaababba", "aaaababbaa", "bbbab", "bbab", "abbb", "ab", "bbb", "bba", "abaaaba", "abaaaaaaab", "bbbabab", "aabaabaa", "aaaababba", "ab", "a", "bbabbbaaa", "ababbbb", "a", "babbab", "babababb", "aaababa", "aabbbaaab", "aabaaa", "a", "aaaa", "bababba", "bba", "aababaabba", "b", "abbaaabaa", "aabaabbbab", "abbaabaaa", "abb", "bab", "aabaaaaa", "b", "ba", "baabaaba", "aabbabb", "aaaabaaaa", "ababbbbbaa", "abbaaaba", "ab", "bbbbabbaa", "bbbaaaaa", "abababb", "a", "aabbaba", "aab", "baabbaaab", "bbb", "b", "ba", "bbbb", "bbbb", "ba", "baab", "b", "babaabaaaa", "baa", "bb", "bbabaab", "abaabaab", "b", "baab", "bbabbaa", "aabbabaaba", "a", "aaaabb", "babbbaabab", "babbbabbab", "baababba", "baaab", "ba", "aa", "baabbaba", "babaabba", "babbbb", "bbaaa", "baaaa", "ba", "bbabbab", "bba", "bbaaaaaabb", "bbbabbb", "ababbbabba", "abbabbbbb", "babbbbaaab", "babaabab", "a", "bbaabbbbbb", "ba", "abba", "a", "bbbbbaaaaa", "ababbbaab", "babbab", "aabb", "bbaabbba", "abb", "bab", "ab", "baa", "ababba", "abbab", "aa", "bbabbbaabb", "ababbb", "abaabb", "aaaabbaab", "bbbbbbbbb", "abbbb", "abbab", "b", "a", "bab", "a", "baba", "abaabaabb", "baab", "abb", "bababb", "aaababba", "abbbbabaa", "a", "baaaabaa", "abaab", "aaaababba", "aaa", "bb", "ab", "abbab", "baaa", "bbbaabba", "baababaabb", "aabbaabaa", "a", "baabbaa", "bab", "b", "baabbabbb", "bbaaabb", "aaa", "abbaabbb", "baba", "a", "bbaa", "bbaaabaa", "aaaba", "bba", "aabaabbaaa", "bba", "bbb", "baaabbbbab", "aabba", "abbbaaab", "aa", "aaaa", "bbaaabbabb", "babaa", "baab", "baa", "bbaaba", "babbbbbbbb", "a", "baaabaabba", "aaaaaba", "abbbaabba", "b", "babaabaa", "aaabbaaaa", "abab", "bba", "abaabbb", "bbaabb", "ba", "aabbabaab", "abab", "bbbbaaaaa", "bbabbba", "bbaba", "babba", "bbabab", "bbaab", "abab", "baab", "b", "ababbabab", "bbabaaabbb", "b", "ab", "aabbb", "ababaabb", "abaaaab", "bb", "aabaaaab", "ababaab", "aabaabbb", "aabbaa", "ababaabbb", "bbaaaba", "bbaaaba", "babb", "bab", "aa", "bbbbba", "baab", "abaaaaba", "baabbabba", "bb", "ab", "bbbbbabab", "abbaaa", "aa", "a", "baba", "aaababb", "abbb", "bbababbab", "bb", "aababaab", "aa", "b", "bbabaabaa", "bbababab", "bbababaaa", "abbab", "aabababbaa", "abaaaaaaaa", "aabbbbba", "a", "bbbaaaaaaa", "a", "aaabab", "aaabaabb", "aaa", "bababbaa", "bbbaba", "baabbab", "b", "aaba", "bbbbbababa", "aabbabbbaa", "bbbbbbb", "baabb", "babaabaaaa", "aabbbaaaaa", "abaaa", "bbab", "aaab", "b", "bab", "bbababb", "b", "a", "aaa", "ba", "baabbbba", "aaabbaaa", "baab", "aabaaababa", "aa", "a", "baabababba", "abbaa", "abbbbaaab", "abbab", "aa", "baaabaaabb", "abb", "abbab", "babaaa", "b", "abab", "bbbbbababb", "bbb", "bab", "abaab", "aba", "aaa", "baabaaaa", "babaaaa", "abbbabb", "aabbbbb", "aabbabbaa", "babb", "abbaaababb", "babbb", "bbaaaaa", "baabb", "aaa", "a", "aaab", "ababbaaabb", "ab", "baaaabbba", "bbaba", "bbaa", "bbbabbb", "b", "bbbababa", "abaabaaa", "ab", "aaaba", "bbbbb", "b", "bbb", "aaaabbbab", "baab", "abbaa", "bbbbbbb", "abab", "aaa", "a", "babbb", "abbbaba", "aabba", "babbbb", "bbabaaaaaa", "bbbbbab", "aa", "baaab", "bbbaaa", "a", "baaba", "baabbbabba", "aaaaab", "abaa", "bb", "a", "aba", "b", "babaababa", "aabbbaabab", "a", "baaabaabab", "bbb", "ab", "babbbbb", "bbbabbabb", "ba", "baaa", "bbaabbb", "b", "abbabba", "bbbbaaaba", "babbbaaabb", "ab", "ab", "aaab", "bbab", "abbbba", "ababaaa", "a", "aababa", "babbabbb", "bbaabaaaba", "a", "aabaaba", "bb", "baa", "bbbbaa", "abbba", "baabab", "abab", "baba", "aabbbabbb", "ba", "a", "aababaaa", "abbbbb", "abbbb", "ba", "abbbaaaa", "babaaba", "aaba", "babbaba", "abba", "babaa", "aaba", "baaab", "a", "ba", "aaabbbbbb", "ababaaaaba", "abbabaa", "ababa", "abbbbaa", "a", "abbaababaa", "bbaa", "baa", "babb", "baba", "bbaaabaa", "baa", "baaabbb", "b", "baabbaba", "aababbabbb", "aabaabaaa", "bbba", "abbb", "babababaaa", "babbbaa", "aabba", "aba", "aaab", "bbaabaab", "aaabbb", "bababbb", "baaa", "babba", "aaaba", "bbabb", "aaabbb", "ba", "aba", "abaaababba", "aaa", "abbabbba", "aabbbbb", "baabaa", "bbbbaa", "bbbaa", "bbbaaa", "aabbbbabb", "bab", "bbaaabbbab", "baab", "bab", "b", "baaab", "bbb", "b", "a", "ab", "bbbababbab", "aaabbbaaa", "aaabbbb", "ba", "aababaa", "bbaaba", "abbabba", "bbbbabb", "a", "aabbaabbaa", "aabbaabb", "bbbb", "abba", "babab", "bb", "bababb", "aababab", "a", "baaa", "bbaababbb", "a", "baaababb", "ba", "bbaaababba", "babaaabab", "a", "baa", "baabbabbaa", "ababaaa", "baaabbbbaa", "abb", "abaaab", "baaaaaab", "b", "baaabb", "aba", "bbaba", "bbaaa", "abbbbbab", "bbba", "aaababb", "babbab", "aaabaaa", "aaabbb", "bb", "abbbba", "abbaabab", "aa", "bababbaa", "babbabaaab", "abbb", "aabbaaba", "baa", "aaaaaaa", "bbbbbbba", "baab", "bbaaa", "a"};
        String[] words = {"aaaaabbbaa", "aababbaa", "abbb", "bbbb", "baaaab", "bbabb", "ab", "bbaabbabba", "bbbbbab", "bababaab", "bba", "bbb", "aaba", "babba", "aaaba", "a", "bbaab", "aaaab", "baaaab", "abbbab", "abbaab", "aabababa", "abbaba", "bba", "baabbb", "bab", "bbbbbbbbaa", "aba", "b", "bbaaaaaaaa", "ba", "abbaaa", "babaaabbb", "a", "ababaa", "ab", "bbbbbb", "babaaaabba", "aaaabbbb", "b", "abaaaababb", "aaaaabbba", "aabb", "abbbbab", "b", "bb", "bab", "aaabaabb", "babbababbb", "bbbaab", "a", "aabbbbb", "a", "abbab", "aaa", "a", "ababbb", "bbabbb", "ba", "bbb", "babababa", "bbbbbbba", "babb", "ba", "bbbbaa", "ababaaba", "aab", "abaaba", "babaa", "baabbbbb", "baba", "bba", "aaaabbb", "ababaaba", "abbbbb", "aba", "baabab", "ba", "bbb", "a", "baaabab", "ab", "bbabbbb", "bbbaab", "b", "bab", "bb", "baab", "baaababb", "abaaaa", "baa", "aaba", "aabbaabaaa", "baaa", "baabbabbb", "bbabaa", "aa", "aabbba", "b", "bbaba", "aab", "bbba", "aababab", "abaabbaa", "a", "bbaabbba", "baa", "babbaaab", "bbaaabbbb", "ba", "ab", "aaa", "b", "aaaaab", "baaabbbab", "aaaaababa", "abaa", "aaaaab", "ba", "aaaabbaa", "abbbb", "baabbbbaba", "ab", "baaaa", "bbabab", "b", "abaab", "aab", "babbabbbba", "bb", "abb", "babbbbaa", "ba", "bb", "baabbabb", "bbaaabb", "aabbbb", "a", "bbaa", "bbaaaba", "bbbbb", "ab", "b", "bbaa", "bbbabaab", "bbb", "abaaaaabbb", "bbbaa", "bba", "aabbbaaaaa", "abbbabbbbb", "aaabba", "abbbaababb", "ababbaa", "ababaabaa", "a", "aaabaaaaaa", "bb", "baba", "b", "abb", "abba", "aaababbaa", "aaabbbb", "a", "babbbab", "abbaaab", "aba", "aba", "b", "abaaa", "baabbbaa", "baaaabba", "aaaababa", "bbbaaab", "a", "baaabbb", "aababaabaa", "ba", "baabbbaba", "aabab", "abba", "bbbaabaab", "babbaaaaba", "abaaaaaab", "aaaa", "b", "abbbaabab", "aaaab", "bbbabbabba", "aabbbb", "aaabbaba", "baaabbaab", "bbbbaaaaa", "bbbababaaa", "ababbabba", "aababbaaba", "aaababbbb", "a", "baababba", "abaaa", "abbbbaa", "babb", "aaaabbbba", "bbaaabb", "aaabb", "aabababbab", "abab", "bbaba", "baa", "bbaabaa", "abbbbaabaa", "aaab", "ababa", "aabba", "baaababbab", "aabbaa", "aababbbaab", "bbab", "abababaa", "aaaaba", "bbbaabba", "bbabaabba", "ababa", "babbbbba", "ababba", "bbabb", "b", "bbbaaa", "baa", "bbaaba", "a", "aba", "babaabba", "aa", "bbb", "aba", "abaaaabba", "baaaba", "bbba", "a", "ab", "baaa", "bbbbab", "baaabb", "a", "bb", "baaaabbbab", "baabb", "a", "aa", "babbabaab", "a", "aababbaa", "bbaabab", "aba", "bba", "ba", "aabbaaab", "aab", "baabaaab", "bbbbbbabbb", "abaabbaaab", "bbbbbabbab", "ba", "bbbabaaa", "bbabaa", "bbaabb", "ba", "aaba", "babbabbb", "babab", "abbaabbb", "bbaabbbab", "bbababbbb", "bbaa", "abbbb", "b", "bbaabaabb", "aaababaa", "aaabaaba", "abbba", "b", "aa", "bbbbab", "bababaaaa", "bbabaaaab", "babaaaab", "b", "bab", "abbbaaabbb", "aababaabaa", "abbbaa", "aaabab", "a", "a", "aaaba", "ababaa", "aabbababb", "babbb", "aaba", "bba", "bbabb", "babaaa", "abbaabaab", "abba", "baaababab", "aab", "aabaaaab", "bbbabb", "baaba", "ababbaba", "bbb", "bbbaaaba", "ab", "abbaababb", "a", "bb", "abab", "babaababab", "bbbababbab", "ababbaabab", "b", "bbbb", "bbbabbaabb", "baabb", "aabab", "ab", "aabbbab", "abbbaababb", "b", "aaaaabb", "aaabaabb", "bababababb", "baaaaaabba", "aba", "aa", "bbaabbaba", "abbaaa", "bbabaaaa", "aaa", "aaaabaab", "aabbabbaab", "aababab", "ababababa", "aaabaa", "bbabaaaba", "baba", "b", "abbb", "bbababb", "a", "aaabaa", "bbab", "abaabbaaa", "aab", "abaaaaaab", "baa", "aabb", "abaabbaaba", "aaaabbabb", "a", "abab", "aaaa", "bbabbaab", "aabaabb", "aaabaabaaa", "b", "abb", "abbbb", "b", "abbabaaaba", "bbaabbbab", "baba", "abaa", "bbabbbba", "bbabbbbba", "bbbbabb", "bbabb", "aabbb", "bab", "abaa", "bbbaaabb", "babb", "bbabaabaa", "bbaaaab", "baaa", "aba", "baaba", "aabbbaaaaa", "a", "bbaab", "abaab", "abababb", "baabaab", "ababaab", "b", "aababaaaa", "baba", "b", "aabababa", "abbaa", "ababaaaa", "bbbaabbb", "bab", "baabba", "bbbbbab", "baaaa", "ababbbaaab", "ba", "bbbab", "bbababb", "aaaababba", "babbba", "aba", "a", "bbbaaba", "baabbba", "aaba", "b", "b", "aaabbaab", "aaababb", "aa", "bbababb", "babaaaaabb", "abbabaaaa", "aaaba", "ba", "abbababa", "babba", "abbaabbbba", "bbbbba", "bb", "abbbbaba", "ba", "babbbbbaab", "b", "baaaabaaba", "bab", "aabbbabba", "b", "bbb", "a", "bbbb", "ba", "babbaa", "baa", "bbabbaaa", "baaabba", "aababaaaba", "bbabbaaba", "abababbbbb", "bbbbbb", "baab", "bb", "abbb", "b", "bbbaab", "abbb", "aa", "bbbbabab", "baaababa", "aaab", "babb", "bbbaaa", "baaabba", "ab", "bbaaba", "aababba", "ba", "abbb", "bbabba", "bb", "ababbbbaba", "a", "abb", "a", "aaaabbaaab", "babbb", "a", "aab", "bbbaabaaaa", "baaa", "ba", "bbabab", "aba", "aabbb", "bbbaaa", "bababaa", "bbbaaba", "abaa", "baaab", "bababba", "aabbbabbab", "baaaaa", "babaabaa", "bbaaab", "abaabbbb", "ababbbba", "ab", "aba", "abb", "abbab", "bbb", "a", "aa", "ba", "aaaa", "abbbab", "aaababa", "b", "a", "baaa", "babbbaaa", "b", "aaab", "aabbbaaa", "bbb", "abaabababb", "bbbabbbbaa", "baabaabb", "babbab", "aaabbbabaa", "aa", "aabaababb", "aaaaabab", "baab", "abaa", "b", "bbabbaaabb", "aaba", "abaaaba", "b", "bbbaaa", "bbaaabba", "bbb", "b", "aba", "aab", "bbabbbbb", "bbaaaa", "baaababa", "abb", "abbaaaaaba", "aabbba", "aabababb", "ba", "abb", "baaaaba", "a", "bb", "bbaaa", "aabb", "bab", "aaaabbbba", "bbaa", "b", "abababb", "bbaa", "baaabab", "aab", "abaabb", "bb", "abababaaba", "a", "baaa", "bbabababa", "a", "a", "aabbabbabb", "aa", "aaababba", "bbbba", "aaabbbbb", "bababbaabb", "bbaaaab", "b", "aababbba", "bbabb", "bb", "abbabaaa", "bababaa", "a", "ababbb", "aa", "bbbab", "bbabaaa", "abbba", "a", "baab", "abbabbabab", "aa", "ababbb", "abbbbbbbbb", "b", "bbbaabb", "bbaabbaba", "aaba", "bbbaa", "bbb", "aba", "babb", "aaaaabb", "baabbbbbb", "aaaa", "abababba", "bbbbba", "baabbaaba", "aaaaabbbab", "aabbbbbb", "a", "bbb", "abbbbaabaa", "b", "aabbba", "bba", "aabb", "abbabaaaba", "aba", "bb", "babaaabaa", "abbab", "abb", "bbbbbbbbb", "aaaabab", "aab", "bbbaa", "ba", "babaaaaab", "aabbbb", "abaabaab", "ab", "bbabaaaa", "bbaa", "bbabbbaaa", "abb", "b", "aa", "abbbbaaaaa", "baabababbb", "bbbbbbab", "bb", "bbbbbabba", "abaaabbbb", "bbaababa", "bbba", "ba", "bbbab", "ababaaaa", "aaabbaaba", "bbbabb", "b", "aabbaaa", "baabaa", "bbaabaabbb", "bbbbaabaa", "ab", "bbbab", "aa", "a", "baabaaaa", "ba", "aaabaa", "abaabaabbb", "aaaaa", "abbaa", "abaabaab", "abbbbaa", "a", "bb", "ababab", "aabb", "aabab", "bababbaaaa", "babbbbb", "aaba", "babbaa", "aaaabaab", "aaabbab", "aa", "aabbaa", "abaaaabaa", "aaaabaabb", "aababa", "bbbbabbaab", "abaaba", "aa", "abbb", "bbbaabbaa", "bba", "ab", "bababa", "aaabbab", "baabbbbb", "aabab", "aa", "aba", "bab", "bbaabbbaab", "baba", "abba", "aa", "bbababab", "bb", "babbbabaaa", "b", "bbababaab", "abbbaaaa", "aaababa", "baba", "a", "babaabb", "b", "baababba", "babbbba", "aaa", "aaaba", "bbaabba", "ababaaaab", "b", "abbabbaaab", "bbabaabaab", "ab", "babb", "baabbb", "baaaaaaba", "bbababab", "abbaaabbba", "bbbabbbaa", "bbbbabbba", "abbb", "bbb", "aaaabbb", "babb", "b", "aaa", "bbab", "aaba", "baabbbabab", "bab", "baab", "baaabba", "aaabb", "b", "abbaababba", "aaabb", "baaa", "aabbaa", "a", "aabbaba", "b", "ab", "abbbabaab", "aaabaabab", "bba", "baabbbab", "ababbaaba", "aaabba", "abaaaabbaa", "baa", "abbbbaab", "bbbab", "baaab", "aaabaaaba", "aaaababaa", "aaababa", "ababb", "ba", "abaabbab", "aaa", "aabbabba", "abb", "aaabaabb", "aaba", "baabbaab", "babaa", "a", "bb", "b", "bbaab", "ababaaabb", "a", "abbaba", "bba", "abbabbbaa", "babaaaabbb", "b", "bbabaaa", "a", "bb", "babbabb", "aaabaab", "bbb", "baba", "a", "aaaababaa", "bab", "abbbba", "bababa", "abbabbab", "abbab", "bbabbbaabb", "baab", "a", "baabab", "aabbab", "bbbaba", "bb", "bbbaababa", "a", "aba", "baaaaa", "b", "aaa", "baa", "abaaaa", "b", "bbaa", "baaab", "b", "abbbbbb", "aa", "bbbaabaaab", "baaaaa", "baaaba", "abbabb", "baaaaabbbb", "babbaab", "bba", "ababbbab", "abaababbaa", "aaba", "abbbbababb", "abaaab", "ba", "abbabbaba", "ababbb", "bbb", "abb", "ababbbaaa", "aabaabaab", "babb", "baabbaab", "bbbbaa", "b", "aaab", "abababab", "aa", "baabab", "ba", "bbb", "aaaaaaa", "aaa", "bbbbbba", "abbbaabba", "abaaabab", "aaabbbbab", "aaabb", "abba", "bbbbbbb", "a", "abbbbaaa", "babab", "babb", "baaa", "baa", "abaaaba", "aa", "bbaab", "abbbbb", "abbabba", "bb", "aaababb", "aa", "abaabb", "b", "abaab", "baa", "aabbaaabab", "baabaaabb", "bba", "babb", "ababab", "abaabbbaaa", "bbbbaabbbb", "b", "abbaba", "baa", "a", "bbabbbba", "a", "b", "a", "ba", "bbbba", "bb", "babaabaab", "baaabaabba", "bbbbaaaa", "ababb", "bbabbbab", "bb", "aa", "aba", "aab", "bb", "aba", "bba", "ababbabbab", "bbbbb", "aababa", "bbabbbb", "aaaabbb", "b", "b", "aa", "bbbabbaab", "babaabb", "baabaaaab", "aaaabaabba", "ababbab", "babbbab", "babababb", "a", "bbbaab", "b", "aaab", "babbababab", "ba", "abbaabbab", "bbbabb", "aaaaba", "bbbba", "ab", "babbbaaa", "b", "ab", "bbbbbbaa", "bbbbbb", "bb", "b", "abaaaab", "b", "baab", "abbbaabab", "bb", "bbb", "abaa", "abbabbab", "abbaaaabbb", "aaabaabab", "aabaaaaaba", "aaabbbaaaa", "baaaaa", "ababbabbb", "bbbabbaa", "b", "bbaba", "bb", "bbaabbabbb", "abbaba", "aabaaaa", "abbbaaab", "a", "bbbbbaaaaa", "babbabb", "bbabaa", "ab", "aa", "bbbaabaaba", "aa", "baaaaaabbb", "aaaaa", "aaabbbbbb", "baa", "aaaaab", "bbbbaabbbb", "bbabaaab", "babba", "baba", "bbbbba", "bab", "bbabaaaaba", "bbababab", "b", "bbbbb", "aaaaaabb", "bbbaa", "b", "b", "baaabaa", "babbaaaab", "baabbba", "a", "aa", "ab", "ababaabbbb", "aaaaab", "bab", "b", "baaaaabaab", "bababbab", "bbaabba", "bba", "babbaa", "abb", "bab", "aaaabababb", "b", "b", "aabb", "ab", "b", "abaaaaa", "b", "aaabaa", "abaabba", "abbab", "bbabababab", "abbbbbaa", "aaaaaaabaa", "b", "baabaabb", "aaaa", "baba", "ababbb", "ababb", "aaaabaab", "aaabbbbbab", "baa", "aabaabb", "aa", "bababb", "abaaaa", "b", "abababa", "bbb", "ba", "a", "ab", "ab", "bbbabb", "aabbbbaab", "ab", "b", "abbbbbaa", "aabb", "baaaaaa", "bbbbbbb", "baaabaabab", "abbb", "bbab", "abbaabab", "babaa", "abbaba", "ababab", "bbaaaabaab", "abb", "ababbabbab", "b", "baababba", "bbb", "ababaabbaa", "bab", "bbbab", "abbb", "bbaa", "bba", "abbb", "abb", "abaabbbab", "abababba", "bbaaabba", "abbaa", "bbbaaa", "ab", "aab", "aab", "aaabaa", "bbbababaa", "bbbaaabbb", "baa", "bbaabbb", "abaaabba", "aaa", "a", "baab", "bbaaaaa", "abbaaaa", "aabbaaa", "aaabaabbba", "bbabbaa", "a", "bababbaba", "bbabb", "bbba", "ababb", "aababa", "aaa", "abb", "bbabbaba", "bbabaa", "ba", "aaaabbb", "aab", "aaab", "babb", "baabb", "aab", "babbbbaabb", "aaabaabb", "bba", "ba", "aabb", "aaaba", "abbbbbba", "bbbab", "aaab", "ababaa", "aaabaa", "abbbbbabab", "baaba", "aaa", "baaa", "bbaabb", "babbbaabb", "aabaa", "baa", "b", "b", "b", "baaa", "aaabbbbab", "aa", "aababaa", "bbaabab", "aab", "baaabbab", "bbaaa", "aba", "abbaab", "aaba", "baaaaa", "ababbbb", "bbab", "abaabbbbab", "aababba", "b", "baaabb", "bb", "baaba", "bbbaababba", "aabbbb", "abbbb", "abb", "bbbaab", "abbabaaabb", "ab", "aaaaababb", "aabbb", "aab", "bb", "aa", "aabbba", "bbaaaabbbb", "baabbbaba", "ababbab", "babba", "aa", "baaaaba", "b", "bba", "bbbaabbbab", "ba", "bb", "b", "abaaabbb", "aaaa", "bbbaaba", "abb", "aa", "bbabb", "abb", "baabbbba", "bbbbbaaaaa", "bbabbbbb", "abbbbabbb", "bab", "aabbbaaaaa", "aabab", "bbb", "aabaabb", "babaaababa", "aaba", "ba", "ab", "b", "aabbabb", "a", "bbba", "abba", "babaa", "abaa", "aaabba", "baaa", "ababaaaabb", "aaaababa", "aaabaaba", "aaababbaba", "baabaa", "bbaba", "aaabbaab", "bbb", "bbbbbab", "abaab", "bbbaaaabbb", "b", "bbbaaa", "bbaaaa", "aababa", "babbbbb", "b", "bbbaa", "baaabb", "ababbaabab", "aab", "bb", "bbbaba", "baabbbba", "aa", "aaaabbaa", "b", "abbbbab", "aaabababab", "baababa", "bbaaabbbb", "bbbaabaab", "aabb", "abb", "a", "ba", "baaabbaab", "abbbaaa", "ab", "abbaaaaab", "bbbbbbaaba", "bb", "aabbb", "bbaabbba", "bbbbbbbabb", "aab", "bbbaaba", "abbabbb", "ba", "babab", "babbb", "aabb", "b", "ba", "ba", "aaabbbabab", "aa", "bba", "bba", "b", "a", "aababbb", "aab", "abbbabbbb", "a", "a", "bb", "aaabaaaab", "aaababbbbb", "a", "abbbabaa", "bb", "baabaaaab", "ba", "bbabaaab", "aba", "abbbbbbabb", "abababaaba", "abbabbaaba", "aaaa", "aaa", "baababbaa", "baaa", "aaa", "abbababa", "aba", "ababbabba", "baabbab", "baababbbab", "b", "b", "aaba", "abbabab", "aabbaa", "a", "baabbba", "bb", "bbbabb", "ba", "bbaaabaab", "abaaaaabaa", "bb", "bba", "abbaabbab", "abba", "aabbaaa", "abababba", "bbbaba", "bba", "baabaa", "b", "b", "baaaabab", "abbaabaaab", "bbabbaabab", "babaabba", "ab", "b", "abbaa", "aabba", "b", "babba", "bab", "baaaaba", "aa", "b", "baaa", "bbabbbbb", "abbaababa", "baba", "b", "aabbabaa", "bbaabababb", "ababbaa", "bbaaa", "b", "bbbbabba", "b", "bb", "a", "bbbbaa", "aabb", "bbbbbabbab", "aabb", "bbab", "aabbbab", "baa", "bbabbaa", "baabbbaabb", "baababaa", "aab", "bbb", "a", "babab", "aabbb", "bbabaaaa", "a", "aba", "bb", "aaabbbaa", "aaaaa", "abbb", "babaaaab", "bbbbbaa", "abbbbab", "bbb", "baa", "bbaa", "aa", "abbaab", "baabbabbaa", "ababbabaaa", "bbbbbaaaa", "ba", "abbaabbbb", "a", "abbbaaba", "bababbbbbb", "abaaa", "aaaabbabba", "aabbaa", "ba", "babaabbaa", "bababbaa", "abbbaab", "abbaabaaa", "bbbbaab", "bbbabaa", "bababa", "bbbab", "abbaa", "abaaabbbaa", "babbaab", "bbababaa", "ba", "bba", "aaabba", "ababbaab", "b", "bbbabaabbb", "bbabbab", "baaaababa", "ba", "abaaabaab", "babbbabb", "abaa", "bbbbbabbab", "ba", "aaabbaaaba", "aabb", "aab", "babba", "a", "abbb", "bbaabb", "aa", "bbba", "aa", "bbba", "aa", "abaa", "abaabbb", "bbabba", "aabababba", "abbbabbbaa", "bbbba", "babbaaba", "bbbabbbaa", "bba", "ba", "bab", "aabbb", "abaa", "bababab", "a", "aaa", "bbaabbba", "bbbab", "a", "bba", "bbbbbbbab", "baabaaab", "aaba", "aaab", "babbabbbbb", "ababb", "aabaabaab", "bbbaabaab", "bbabba", "a", "bbbbbbbaa", "bb", "baabbaaab", "bbab", "a", "abbabaaba", "abbabb", "b", "aabba", "ba", "babbbaa", "ab", "aabab", "aabaaba", "abbaaaa", "aabba", "baaaabbba", "bbab", "ba", "aa", "bba", "bbaaa", "ababaa", "bbbabab", "a", "aa", "bbaabbaa", "abbabb", "bbaaabb", "aaaaab", "babaaaa", "bbaaaaa", "a", "baabbba", "a", "bbbaabb", "b", "aababb", "bbaaa", "babababb", "aaa", "bbbbb", "aba", "baab", "babbbbb", "abba", "baabab", "bbbaab", "bbb", "ba", "ba", "bbaabababa", "bbaabaabb", "aaa", "baaaaabb", "ab", "baaabba", "a", "abababb", "baaaabbaba", "babbab", "aa", "aa", "aabaa", "b", "a", "aabaaa", "b", "bbabab", "bababbaaa", "aaaaaabab", "aabaa", "abababbba", "aba", "abab", "abaaaabaab", "bbabbaaaaa", "bab", "abbaaabba", "ababababba", "baabbb", "abbbbb", "aaa", "bababa", "aaabbbab", "b", "abbabaa", "bbab", "aaabbabb", "aaa", "b", "a", "aabbb", "baaabbaaab", "aaaaaab", "abba", "bbaabbabba", "abbaababaa", "ba", "aaaabbaba", "baabb", "aaabbbaab", "a", "bbbaaaaaaa", "bbabbbbbbb", "baaaabbbaa", "b", "a", "a", "abbaa", "aa", "aabaababa", "abba", "bbab", "bb", "aa", "b", "abbabbabb", "abaaab", "bbabbb", "bbbb", "aaaaab", "bbaa", "aababa", "abbaaa", "bab", "abab", "ba", "a", "abb", "bbabab", "baa", "aaa", "abaabbab", "b", "babbaabbb", "ab", "aabbb", "bb", "aaabababa", "bbababbbb", "ababbba", "abb", "abbbbbbaa", "a", "aa", "bbbbbbbaaa", "abaa", "bbbaabab", "ba", "baa", "bbabaa", "b", "babaaaab", "abaaa", "aaabbbbbb", "baabb", "babababbb", "baba", "aabbaaaaab", "babbbab", "aabbbbba", "abbaabb", "ababbbb", "bbabbaaaba", "bbaaa", "aabbaabaa", "bbaa", "aab", "aabbabaa", "baaaa", "bbbabba", "a", "bbbbbb", "baab", "baabbaaaa", "aaa", "b", "bbbabbba", "abbaabbbab", "ababba", "abbaab", "bbaaaaaa", "bbab", "a", "aaaa", "bbabbaa", "aabba", "a", "babaa", "bbbb", "aaabbbbab", "aab", "baaaabbbb", "abbbbbaa", "aab", "baaababaab", "aabbbb", "bbaaa", "abaaaaaba", "abaaaa", "ababbba", "bbbbbbb", "bbabaaa", "baaba", "abab", "abaaaaa", "aabaaaa", "babba", "abaaabbaa", "babbbaabb", "abbbabb", "abbab", "baabbbb", "b", "abbaa", "ba", "babb", "bbaba", "aaabababba", "abbbbb", "b", "bbaabbab", "baabbbaab", "b", "b", "abbbbba", "baaaba", "ababbaabaa", "bbababbaa", "abbabaa", "a", "bbabbbaaab", "bba", "bbbabaab", "bb", "bbba", "bbabbbabaa", "baabaabbb", "abbaababab", "aaaabbbba", "bbabaaaa", "a", "ab", "bbbabba", "babab", "aabaab", "bbbb", "babbaaab", "aabba", "babbbbab", "aab", "abaababa", "baabbb", "aaaabb", "bbaaab", "b", "abbaaba", "bbbbabba", "bbaaab", "bbbbbbabb", "aababaaab", "aabbaaab", "babababaa", "baa", "bbaaabaab", "bbabbbb", "baababbaa", "b", "babbbbabb", "babbbabbbb", "bb", "ababb", "aaabbbbab", "ab", "aabab", "abab", "bb", "bb", "baab", "aababba", "bbabaaabaa", "abbba", "bbabbba", "bbaab", "abbabbabaa", "ababaa", "ba", "bbbbbbbb", "bbaa", "baba", "bbbababb", "bababbaaa", "bbaba", "aaabbb", "abbaaa", "aababaabab", "aabbbb", "abababbbbb", "aaab", "bbabbabbaa", "baaaababba", "a", "ababb", "abaaabbaba", "bababaab", "abaabbab", "bbba", "babbbab", "aaabbabab", "aaaaba", "bbb", "aababaa", "b", "aabbaba", "aa", "bb", "aba", "abaaabab", "abbabbbab", "aabbb", "aabbaa", "a", "ab", "abbb", "ba", "bababbabab", "b", "a", "aaabbab", "ababbb", "bababab", "ab", "abaa", "abbaaabb", "aabababbaa", "aaababa", "aabaaaa", "babbbbbbb", "abaaaba", "b", "a", "babab", "abaaa", "b", "abaababbb", "bbb", "abb", "bbbba", "babbbbaba", "baab", "ba", "b", "aaaabaab", "bbaabbb", "ba", "aaab", "abaaaabb", "bba", "baaababbab", "bbaaabbb", "baaba", "abbbbaabab", "bababba", "bbbaabbba", "aababbabbb", "aabaa", "abbabbb", "aabbbbaba", "aabababbb", "bbbbbbaaba", "babbab", "baaa", "a", "aababaa", "babaa", "bbbbaab", "abbabbbbbb", "bbba", "ba", "aa", "babaaaaa", "ababbbbaa", "bb", "a", "aaab", "aaaaabbaa", "a", "bbb", "bbaabaa", "abbbaabaaa", "aba", "bb", "ba", "babbabbba", "aa", "aaabbabab", "aba", "bababba", "babaabaabb", "aaba", "abbaabbb", "bbabb", "b", "aa", "baaaaabb", "ababab", "aaba", "aabbbbbb", "abaabbbb", "bbbab", "baaaaaa", "bbaabaabb", "b", "b", "bbbababaa", "ab", "aaaa", "abababb", "baaaba", "aabaaabbaa", "aabbbb", "ababa", "babbbaaaa", "abbabbbabb", "ba", "bbbbaabaab", "ababaabbb", "bbaaabbb", "aba", "babbabbbb", "bb", "baabbbb", "abbb", "abbaa", "bababbb", "bbaaa", "a", "aaabbabab", "bbaaaba", "bbbbaababb", "aaaab", "babaaaaaa", "aaabab", "aabaaab", "a", "aaaaba", "a", "aaaabbbbb", "abababa", "b", "baabaa", "bb", "b", "abbbabbaaa", "abaa", "bab", "aab", "aaaabaabba", "aba", "b", "bbaabbba", "bababbabba", "b", "aab", "ba", "babb", "abbaabbba", "baabab", "aaaa", "babaaaaaba", "abba", "aababa", "baba", "bbbaabaa", "bbbbbaba", "abbaaa", "bba", "aababbba", "bbabb", "abbbabba", "bbbbaaaab", "baaa", "a", "bbabb", "aaaabab", "aaa", "bbaaa", "aaaaabb", "babbaab", "aaabaa", "b", "aa", "baabba", "ba", "aabbabbb", "ababb", "bbbbbab", "abbb", "abaaa", "abbb", "aabbbbaa", "aabbbabb", "baabbba", "aabaaab", "aabb", "baaa", "bbaba", "baaabaabbb", "bbaaaa", "abaaab", "baaabb", "abbbbb", "aaab", "baaaabaaaa", "b", "bba", "bbaaaaaba", "bba", "b", "baab", "aaaabaa", "a", "bbaaa", "babb", "bbaaabbb", "bbba", "a", "bbbbbab", "aaabbba", "bbaaa", "aabaaabbb", "ab", "babaa", "bababbaba", "aaaabaaaba", "aba", "abbab", "baba", "ab", "aababbb", "baabaa", "bbaaa", "a"};
        // System.out.println(solution.findSpecialInteger(arr));
        System.out.println(Arrays.toString(solution.numSmallerByFrequency(queries, words)));
        System.out.println(solution.daysBetweenDates("1971-06-29", "2010-09-23"));
    }

    // 1136
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(getDateOffset(date1) - getDateOffset(date2));
    }

    private int getDateOffset(String date) {
        String[] tmp = date.split("-");
        int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int days = 0;
        int year = Integer.parseInt(tmp[0]), month = Integer.parseInt(tmp[1]), day = Integer.parseInt(tmp[2]);
        days += (year - 1971) * 365;
        while (month > 1) {
            days += monthDays[--month];
            if (month == 2 && (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))) {
                days += 1;
            }
        }
        days += day;
        days += (year - 1) / 4 - 1971 / 4;
        days += (year - 1) / 400 - 1971 / 400;
        days -= (year - 1) / 100 - 1971 / 100;
        return days;
    }

    // 1170
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] ans = new int[queries.length];
        int[] lenArr = new int[11];
        for (int i = 0; i < words.length; i++) {
            int tmp = count(words[i]);
            lenArr[tmp]++;
        }
        int total = 0;
        for (int i = lenArr.length - 1; i >= 0; i--) {
            int tmp = lenArr[i];
            lenArr[i] += total;
            total += tmp;
        }

        for (int i = 0; i < queries.length; i++) {
            int cou = count(queries[i]);
            if (cou < 10) {
                ans[i] = lenArr[cou + 1];
            } else {
                ans[i] = 0;
            }
        }
        return ans;
    }

    private int count(String word) {
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[0]) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    // 1154
    public int dayOfYear(String date) {
        String[] arr = date.split("-");
        int[] arr2 = {Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2])};
        int addOne = 0;
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (arr2[1] > 2) {
            if ((arr2[0] % 100 == 0 && arr2[0] % 400 == 0) || (arr2[0] % 100 != 0 && arr2[0] % 4 == 0)) {
                addOne = 1;
            }
        }
        int day = 0;
        for (int i = 0; i < arr2[1] - 1; i++) {
            day += month[i];
        }
        return day + addOne + arr2[2];
    }

    // 1331
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length < 1) {
            return arr;
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int n : arr) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        int[] bucket = new int[max - min + 1];
        for (int n : arr) {
            bucket[n - min] = n - min + 1;
        }
        int offset = 0;
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] == 0) {
                offset++;
            } else {
                bucket[i] -= offset;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = bucket[arr[i] - min];
        }
        return arr;
    }

    // 1313
    public int[] decompressRLElist(int[] nums) {
        int count = 0, index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            count += nums[i];
        }
        int[] ans = new int[count];
        for (int i = 0; i < nums.length; i += 2) {
            while (nums[i] > 0) {
                nums[i]--;
                ans[index++] = nums[i + 1];
            }
        }
        return ans;
    }

    // 1137
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n < 3) {
            return 1;
        }
        int[] arr = {0, 1, 1};
        int i = 3, tmp = 0;
        while (i <= n) {
            tmp = i++ % 3;
            arr[tmp] += arr[(tmp + 1) % 3] + arr[(tmp + 2) % 3];
        }
        return arr[tmp];
    }

    // 1299
    public int[] replaceElements(int[] arr) {
        if (arr.length < 1) {
            return arr;
        }
        int rightMax = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int tmp = arr[i];
            arr[i] = rightMax;
            rightMax = Math.max(tmp, rightMax);
        }
        return arr;
    }

    // 1128
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] arr = new int[81];
        for (int[] aa : dominoes) {
            int index = getIndex(aa);
            arr[index]++;
        }
        int pairs = 0;
        for (int a : arr) {
            if (a >= 2) {
                pairs += a * (a - 1) / 2;
            }
        }
        return pairs;
    }

    private int getIndex(int[] arr) {
        if (arr[0] > arr[1]) {
            return (arr[1] - 1) * 9 + arr[0] - 1;
        } else {
            return (arr[0] - 1) * 9 + arr[1] - 1;
        }
    }

    // 1287
    public int findSpecialInteger(int[] arr) {
        int curr = 0, pre = arr[0];
        int len = arr.length / 4;
        for (int num : arr) {
            if (num == pre) {
                curr++;
                if (curr > len) {
                    return num;
                }
            } else {
                curr = 1;
                pre = num;
            }
        }
        return curr;
    }

    // 1122
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] bucket = new int[1001];
        int[] ans = new int[arr1.length];
        for (int n : arr1) {
            bucket[n]++;
        }
        int index = 0;
        for (int n2 : arr2) {
            while (bucket[n2] > 0) {
                bucket[n2]--;
                ans[index++] = n2;
            }
        }
        for (int i = 0; i < bucket.length; i++) {
            while (bucket[i] > 0) {
                bucket[i]--;
                ans[index++] = i;
            }
        }
        return ans;
    }

    // 1619
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length / 20;
        double count = 0;
        for (int i = len; i < arr.length - len; i++) {
            count += arr[i];
        }
        return count / (arr.length - len * 2);

        // heap
        /*int queueLen = arr.length / 20;
        PriorityQueue<Integer> little = new PriorityQueue<>(queueLen);
        // PriorityQueue<Integer> big = new PriorityQueue<>(queueLen, Collections.reverseOrder());
        PriorityQueue<Integer> big = new PriorityQueue<>(queueLen, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        double count = 0;
        for (int num : arr) {
            if (little.size() < queueLen) {
                little.add(num);
            } else if (num > little.peek()) {
                int tmp = little.poll();
                little.add(num);
                if (big.size() < queueLen) {
                    big.add(tmp);
                } else if (big.peek() > tmp) {
                    count += big.poll();
                    big.add(tmp);
                } else {
                    count += tmp;
                }
            } else if (big.size() < queueLen) {
                big.add(num);
            } else if (num < big.peek()) {
                count += big.poll();
                big.add(num);
            } else {
                count += num;
            }
        }

        return count / (arr.length - queueLen * 2);*/
    }

    // 1108
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
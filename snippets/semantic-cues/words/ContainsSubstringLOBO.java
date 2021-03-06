package com.fmri.words;

public class ContainsSubstringLOBO {

    // topdown scrambled: layout original, beacons original
    public boolean containsSubstringLOBO(String word, String kopkzvqnm) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < kopkzvqnm.length(); j++) {
                if (i + j >= word.length())
                    break;
                if (word.charAt(i + j) != kopkzvqnm.charAt(j)) {
                    break;
                } else {
                    if (j == kopkzvqnm.length() - 1) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

}

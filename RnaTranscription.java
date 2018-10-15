class RnaTranscription {

    String[] dnaStrands = {"A", "C", "G", "T"};
    String[] rnaStrands = {"A", "C", "G", "U" };
    String[] complementRNAStrands = new String[4];

    String transcribe(String dnaStrand) {
        StringBuilder result = new StringBuilder("");
        rnaTranscription();
        if (dnaStrand.length() == 1) {
            for (int index = 0; index < dnaStrands.length; index++) {
                if (dnaStrand.equals(dnaStrands[index])) {
                    result.append(complementRNAStrands[index]);
                }
            }
        } else {
            for(int dnaStrandIndex = 0 ; dnaStrandIndex<dnaStrand.length() ; dnaStrandIndex++) {
                for(int dnaStrandsIndex = 0 ; dnaStrandsIndex<dnaStrands.length ; dnaStrandsIndex++) {
                    String temporary = dnaStrand.substring(dnaStrandIndex,dnaStrandIndex+1);
                    if ( temporary.equals(dnaStrands[dnaStrandsIndex])) {
                        result.append(complementRNAStrands[dnaStrandsIndex]);
                    }
                }
            }
        }
        return result.toString();
    }

    private void rnaTranscription(){
        int complementIndex=0;
        for(int index = rnaStrands.length-1 ; index>=0 ; index--) {
            complementRNAStrands[complementIndex] = rnaStrands[index];
            complementIndex++;
        }
    }
}

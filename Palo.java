public enum Palo {
    PICAS("picas"), TREBOLES("treboles"), ROMBOS("rombos"), CORAZONES("corazones");
    
    private String value;

    private Palo(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}

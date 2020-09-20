public class PPS {
    
    //Data Members
    private String pps;
    private String result;

    //Constructor
    public PPS(String pps){
        this.pps = pps.toLowerCase();
    }

    public String computeAndGetVaidity(){

        boolean ppsCheck = true;

        if(this.pps.length() != 8){
            this.result = "Your PPS number is not the correct length";
            ppsCheck = false;
            return this.result;
        }
        if(ppsCheck){
            for(int i = 0; i < this.pps.length()-1;i++){

                if(!(Character.isDigit(pps.charAt(i)))){
                    ppsCheck=false;
                    this.result = "The first 7 characters of your PPS need to be Digits";
                    break;
                }

            }
        }

        if(ppsCheck){
            if(!(pps.charAt(pps.length()-1)=='a'||pps.charAt(pps.length()-1)=='e'||pps.charAt(pps.length()-1)=='i'||pps.charAt(pps.length()-1)=='o'||pps.charAt(pps.length()-1)=='u')){
                ppsCheck = false;
                this.result = "The last character of your PPS should be a Vowel";
            }
        }

        if(ppsCheck){
            this.result = "Your PPS is valid!";
        }

        return this.result;
    }

}
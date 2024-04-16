package poe;

public class CheckingLoginFormat 
{
    public boolean CheckFormat(String password)
    {
      boolean CorrectFormat = false;
      String SpecialCha[] = {"@","#","!","$","%","&","*","-","_",">","<","?",":",";","(",")","'",","};
        int count = 0;
        while (count < SpecialCha.length)
        {
            if (password.contains(SpecialCha[count]))
            {
            //this will check if the password will contain either of the special characters
                CorrectFormat = true;
                count = SpecialCha.length;
            }
             count++;
        }
      
      return CorrectFormat;     
    }
    boolean lng;
        public boolean HasEnoughChar(String password)
        {
            if (password.length() >= 8)
            {
               lng = true;
            }
            else
            {
                lng = false;
            }
            return lng;   
        }
    boolean cpt;
        public boolean HasCapital(String password)
        {
            boolean CapLetter = false;
            String CAPITAL[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
              int count = 0;
              while (count < CAPITAL.length)
              {
                  if (password.contains(CAPITAL[count]))
                  {
                  //this will check if the password will contain either of the special characters
                      CapLetter = true;
                      count = CAPITAL.length;
                  }
                   count++;
              }

            return CapLetter;
        }
         
}

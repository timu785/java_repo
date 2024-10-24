package javagit;

public class JavaGit {
    
    public static void main(String[] args) {
        int homerseklet = 7;
        String eredmeny = "nem viszek kabatot";
        if(homerseklet < 10)
        {
            eredmeny = "viszek kabátot";
        }
        System.out.println(eredmeny);
        
        final int HIDEG_HATAR = 10;
        int fok = 7;
        boolean hidegVan = fok < HIDEG_HATAR;
        eredmeny = hidegVan ? "nem viszek" : "viszek";
        System.out.println(eredmeny);
    }
    
}

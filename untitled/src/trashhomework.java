public class trashhomework {
    String name;
    String skill;
    int att;
    int hP;
    int mP;

    trashhomework(String humanName,int humanatt , int humanhp , int humanmp, String skillname ) {
        name = humanName;
        att = humanatt;
        hP = humanhp;
        mP = humanmp;
        skill = skillname;
    }

    void shout(){
        System.out.println(name+"/att:" + att +"/hp:" +hP+"/mp:" + mP+"/skillname:" +skill);

    }

}

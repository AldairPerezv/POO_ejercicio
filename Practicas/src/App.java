public class App {
    
    public static void main(String[] args) throws Exception {

        Goku goku=new Goku();
        goku.setFace("Face > Super saiyain face 1");
        goku.setNombre("Nombre > Sam goku");
        goku.setPlaneta("Planeta > tierra");
        goku.saiajin();
        System.out.println(goku.getFace());
        System.out.println(goku.getPlaneta());
        System.out.println(goku.getNombre());

        Picoro picoro=new Picoro();
        picoro.setNombre("Nombre > Picoro");
        picoro.setFace("Face > Picorosama");
        picoro.setPlaneta("Planeta > tierra");
        picoro.namecusein();
        System.out.println(picoro.getFace());
        System.out.println(picoro.getPlaneta());
        System.out.println(picoro.getNombre());

        Gohan gohan=new Gohan();
        gohan.setNombre("Nombre > Gohan");
        gohan.setFace("Face > Super saiyayin face 3");
        gohan.setPlaneta("Planeta > tierra");
        gohan.saiajin();
        System.out.println(gohan.getFace());
        System.out.println(gohan.getPlaneta());
        System.out.println(gohan.getNombre());
    } 
}
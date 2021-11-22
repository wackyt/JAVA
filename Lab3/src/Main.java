public class Main
{
    public static void main(String[] args)
    {
        Plate plate = new Plate("White");
        Glass glass = new Glass("Transparent");

        System.out.println("Glass info");
        System.out.println
        (
            "Color: " + glass.GetColor() +
            "\nMaterial: " + glass.GetMaterial() +
            "\nIs empty?: " + glass.IsEmpty()
        );
        System.out.println();

        System.out.println("Plate info");
        System.out.println
        (
            "Color: " + plate.GetColor() +
            "\nMaterial: " + plate.GetMaterial() +
            "\nIs dirty?: " + plate.IsDirty()
        );
        System.out.println();

        glass.Fill();
        plate.Clean();

        System.out.println("Glass info");
        System.out.println
        (
            "Color: " + glass.GetColor() +
            "\nMaterial: " + glass.GetMaterial() +
            "\nIs empty?: " + glass.IsEmpty()
        );
        System.out.println();
        System.out.println("Plate info");
        System.out.println
        (
            "Color: " + plate.GetColor() +
            "\nMaterial: " + plate.GetMaterial() +
            "\nIs dirty?: " + plate.IsDirty()
        );
    }
}

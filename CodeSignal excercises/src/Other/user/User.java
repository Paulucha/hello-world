package Other.user;

/**
 * 1. Stwórz interfejs User, który posiada pole name oraz metodę showInfo()
 * 2. Stwórz klasę Admin oraz Developer, które implementują interfejs User
 * 3. Metoda showInfo() powinna wyświetlać napis w formacie name – role, gdzie rola oznacza typ użytkownika (admin, dev)
 * 4. Stwórz obiekty obydwu typów
 * 5. Wywołaj metodę showInfo() dla każego z nich
 */
public interface User {
    public String name = "Ziomek";

    public void showInfo();
}

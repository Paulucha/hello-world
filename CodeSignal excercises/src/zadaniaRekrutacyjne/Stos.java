package zadaniaRekrutacyjne;

public class Stos {

    // Zdefiniowanie tablicy i elementów odpowiedzialnych za wierzchołek.
    double[] tab;
    int firstFree;

    // Konstruktor, który zainicjuje wierzchołek i stos o odpowiedniej
    // wielkości.
    public Stos(int MaxSize) {
        tab = new double[MaxSize];
        firstFree = 0;
    }

    // Metoda zwracająca maksymalny rozmiar stosu
    int getMaximumStackSize() {
        return tab.length;
    }

    // Metoda zwracająca prawdę, jeżeli stos jest pusty
    boolean isEmpty() {
        if (firstFree == 0) {
            return true;
        } else
            return false;
    }

    // Metoda zwracająca rozmiar stosu
    int getSize() {
        return firstFree;
    }

    // Metoda dodająca na stos
    void Push(double E) throws ArrayIndexOutOfBoundsException {
        if (firstFree < tab.length) {
            tab[firstFree] = E;
            firstFree++;

        } else {
            throw new ArrayIndexOutOfBoundsException(
                    "Przepełnienie stosu, operacja nie powiodła się");
        }
    }

    // Metoda zdejmująca ze stosu
    double Pop() throws IndexOutOfBoundsException {
        if (firstFree <= 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiodła się");
        }

        double temp = tab[firstFree - 1];
        firstFree--;
        return temp;
    }

    // Metoda wyświetlająca zawartość stosu
    void display() throws IndexOutOfBoundsException {
        if (firstFree == 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiodła się");
        }

        int temp = firstFree - 1;
        do {
            System.out.println(tab[temp]);
            temp--;
        } while (temp > -1);

    }

    // Metoda wielokrotnego zdjęcia
    void multiPop(int k) {
        if (k < firstFree) {
            for (int i = k; i > 0; i--) {
                System.out.println(Pop());
            }
        }
    }

    // Metoda czyszcząca stos
    void clear() {
        for (int i = 0; i < firstFree; i++) {
            tab[i] = 0.0;

        }

        firstFree = 0;
    }

    // Metoda odwracająca kolejność elementów na stosie
    void reverse() {
        for (int i = 0; i < firstFree / 2; i++) {
            double temp = tab[i];
            tab[i] = tab[firstFree - 1 - i];
            tab[firstFree - 1 - i] = temp;

        }
    }
}


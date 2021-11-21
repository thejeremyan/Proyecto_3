package Main;

public class Sort_Alphabet {
    public void Sort()
    {
        // storing input in variable
        int n = 15;

        // create string array called names
        String names[]
                = { "Alajuela",
                "Pozos",
                "Santa Ana",
                "Escazu",
                "Alajuelita",
                "Desampa",
                "Curri",
                "Zapote",
                "San pedro",
                "Coronado",
                "Moravia",
                "Heredia",
                "Belen",
                "Pavas",
                "Sabana"
        };
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // to compare one string with other strings
                if (names[i].compareTo(names[j]) > 0) {
                    // swapping
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        // print output array
        System.out.println(
                "The names in alphabetical order are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}

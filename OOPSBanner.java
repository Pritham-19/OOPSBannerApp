public class OOPSBannerApp {

    // Inner Class
    static class CharacterPatternMap {
        char character;
        String[] pattern;

        // Constructor
        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Create pattern map
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        maps[0] = new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        maps[1] = new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        maps[2] = new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        maps[3] = new CharacterPatternMap(' ', new String[]{
                "  ",
                "  ",
                "  ",
                "  ",
                "  "
        });

        return maps;
    }


    // Get pattern
    public static String[] getCharacterPattern(char ch,
                                               CharacterPatternMap[] maps) {

        for (CharacterPatternMap m : maps) {
            if (m.getCharacter() == ch) {
                return m.getPattern();
            }
        }

        return new String[]{
                "????",
                "????",
                "????",
                "????",
                "????"
        };
    }


    // Print message
    public static void printMessage(String message,
                                    CharacterPatternMap[] maps) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < message.length(); j++) {

                String[] pattern =
                        getCharacterPattern(message.charAt(j), maps);

                System.out.print(pattern[i] + " ");
            }

            System.out.println();
        }
    }


    // Main
    public static void main(String[] args) {

        CharacterPatternMap[] maps =
                createCharacterPatternMaps();

        printMessage("OOPS", maps);
    }
}
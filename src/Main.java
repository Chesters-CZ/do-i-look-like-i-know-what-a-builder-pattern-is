import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в балиндр. Теперь вы зарегистрируете свою учетную запись.");
        System.out.println();
        System.out.println("Выберите ваше имя пользователя");
        String username = scanner.nextLine();
        System.out.println("Хорошо, " + username +"! Теперь выберите свой пароль. Рекомендуется, чтобы ваш пароль состоял из восьми или более символов и содержал хотя бы одну букву, одну цифру и один специальный символ, хотя нам наплевать, включаете ли вы их на самом деле.");
        String password = scanner.nextLine();

        System.out.println("Следующие необязательны");
        System.out.println("Хотели бы вы раскрыть дополнительную информацию? Это включает ваше имя, фамилию, год рождения, номер телефона и пол. Вы можете ввести все или ничего. Середины нет. д/н");

        String response = scanner.nextLine();
        if (response.split("")[0].equals("д")||response.split("")[0].equals("y")){
            System.out.println("введите свой год рождения");
            int birthyear = scanner.nextInt();
            System.out.println("Введите свое имя");
            if (scanner.nextLine().equals("")){} //tenhle řádek se z nějakýho důvodu přeskakuje.
            String nam = scanner.nextLine();
            System.out.println("введите вашу фамилию");
            String prijmeni = scanner.nextLine();
            System.out.println("введите свой номер телефона");
            int phone = scanner.nextInt();
            System.out.println("выберите один из следующих полов: AGENDER, ANDROGYNE, APORAGENDER, AUTIGENDER, BIGENDER, CISGENDER, DEMIBOY, DEMIGIRL, GENDERFLUID, GENDERFLUX, GENDERQUEER, QUESTIONING, MAN, MAVERIQUE, NEUTROIS, NONBINARY, PANGENDER, POLYGENDER, THIRD, TRANSFEMININE, TRANSGENDER, TRANSMASCULINE, TRIGENDER, TWOSPIRIT, WOMAN, KETCHUP, KETCHUP_BOTTLE, BOTTLE, ATTACK_HELICOPTER, HELICOPTER, LEGO, NONE, OTHER, COCACOLA_GLASS, YES, NO, BISCUIT, CHOCOLATE_CHIP_COOKIE, NEUTRAL, HERMAPHRODITE, INTERSEX, MTF, FTM, NONCONFORMING, NEITHER, FURRY, AI, SPIRIT, GOD, VODKA, RUSSIA, BORON, PLANT, LAUNDRY, FINGERLESS, KOLECHIA, ARSTOTZKA, DISCORD, MLP, MICROSOFT_WINDOWS, GABE_NEWELL, HALF_LIFE_3, CHOMPSKI, G_MAN, SPOTIFY, POP_TART, GOOGLE, REPTILIAN, FLAT_EARTHER, CACTUS, URANUS, MARS, ZEUS_X27, PHIL_SWIFT, CUM, DOOMGUY, TI_83_GRAPHING_CALCULATOR, ASIA, POPE, DECEASED, AVAST_FREE_ANTIVIRUS, AVAST_PREMIUM_SECURITY, PORNHUB_PREMIUM, MUSTARD, ORANGE, GREEN, APPLE, PEAR, EXTRATERRESTRIAL, F16, NOKIA_3310, NOKIA_6310I, QUEEN_OF_ENGLAND, BIG_BEN, HEROBRINE, STEVE_HARVEY, PEW_DIE_PIE, CHARGED_ELECTRON, MICHAEL_REEVES, DING_DING, REAL_SCOUT_TF2, ALIEXPRESS, SANS_UNDERTALE, PROGRAMMABLE_DOORBELL, OBAMA_PRISM, PICO, CHICO, COCO, WEEB, DISCORD_MODERATOR, DE_DUST2, THOMAS_THE_THERMONUCLEAR_BOMB, THE_KAREN, KAREL, SYSTEM32, HENTAI, SHOTACON, LOLICON, PAVEL, JOHN_WICK_FROM_FORTNITE, YOUTUBE_BUDDY, SUSAN_WOJICKI, THE_POKEMON_COMPANY, POKEMON, VLADIMIR_PUTIN, GLOBGOGABGALAB_THE_SCHWABBLE_DABBLE_WABBLE_GABBLE_FLIBBA_BLABBA_BLAB, GLIB_A, SMASH_MOUTH, SHREK, SCOTLANDIA, DIHYDROGEN_MONOXIDE, BIG_CHUNGUS, SMALL_CHUNGUS, MEDIUM_CHUNGUS, REGGIE, EXPLOSIVE_ORDINANCE, SENTRY, SCENT_TREE, GENETIC_LIFEFORM_AND_DISK_OPERATING_SYSTEM, LITAJICI_KAMEN, MAYONNAISE, IRELAND, H3NTAI, CHAD_THUNDERCOCK, CATGIRL, SLIGHTLY_TECHNOLOGICALLY_EDITED_MALE, AVAST_ANTIVIRUS, STURMGEWEHR_1944, FUCKING_UHHHH, PAPRIKA");
            if (scanner.nextLine().equals("")){} //tenhle řádek se z nějakýho důvodu taky přeskakuje.
            String strgender = scanner.nextLine();
            User.genders gender = User.genders.valueOf(strgender);

            System.out.println("Создание учетной записи может занять некоторое время.");
            User u1 = new User.Builder(username, password).jmeno(nam).prijmeni(prijmeni).birthyear(birthyear).phone(phone).gender(gender).build();
        }
        else {
            System.out.println("Создание учетной записи может занять некоторое время.");
            User u1 = new User.Builder(username, password).build();
        }
        System.out.println("ваша регистрация прошла успешно. Теперь вы можете искать горячих одиночек в вашем районе.");
    }
}
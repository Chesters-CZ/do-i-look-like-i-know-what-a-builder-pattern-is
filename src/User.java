public class User {
    // firstname, lastname, age, username, password, gender, phone
    private String jmeno;
    private String prijmeni;
    private int birthyear;
    private String nick;
    private String password;
    private int phone;
    private genders gender;
    enum genders {
        AGENDER, ANDROGYNE, APORAGENDER, AUTIGENDER, BIGENDER, CISGENDER, DEMIBOY, DEMIGIRL, GENDERFLUID, GENDERFLUX, GENDERQUEER, QUESTIONING, MAN, MAVERIQUE, NEUTROIS, NONBINARY, PANGENDER, POLYGENDER, THIRD, TRANSFEMININE, TRANSGENDER, TRANSMASCULINE, TRIGENDER, TWOSPIRIT, WOMAN, KETCHUP, KETCHUP_BOTTLE, BOTTLE, ATTACK_HELICOPTER, HELICOPTER, LEGO, NONE, OTHER, COCACOLA_GLASS, YES, NO, BISCUIT, CHOCOLATE_CHIP_COOKIE, NEUTRAL, HERMAPHRODITE, INTERSEX, MTF, FTM, NONCONFORMING, NEITHER, FURRY, AI, SPIRIT, GOD, VODKA, RUSSIA, BORON, PLANT, LAUNDRY, FINGERLESS, KOLECHIA, ARSTOTZKA, DISCORD, MLP, MICROSOFT_WINDOWS, GABE_NEWELL, HALF_LIFE_3, CHOMPSKI, G_MAN, SPOTIFY, POP_TART, GOOGLE, REPTILIAN, FLAT_EARTHER, CACTUS, URANUS, MARS, ZEUS_X27, PHIL_SWIFT, CUM, DOOMGUY, TI_83_GRAPHING_CALCULATOR, ASIA, POPE, DECEASED, AVAST_FREE_ANTIVIRUS, AVAST_PREMIUM_SECURITY, PORNHUB_PREMIUM, MUSTARD, ORANGE, GREEN, APPLE, PEAR, EXTRATERRESTRIAL, F16, NOKIA_3310, NOKIA_6310I, QUEEN_OF_ENGLAND, BIG_BEN, HEROBRINE, STEVE_HARVEY, PEW_DIE_PIE, CHARGED_ELECTRON, MICHAEL_REEVES, DING_DING, REAL_SCOUT_TF2, ALIEXPRESS, SANS_UNDERTALE, PROGRAMMABLE_DOORBELL, OBAMA_PRISM, PICO, CHICO, COCO, WEEB, DISCORD_MODERATOR, DE_DUST2, THOMAS_THE_THERMONUCLEAR_BOMB, THE_KAREN, KAREL, SYSTEM32, HENTAI, SHOTACON, LOLICON, PAVEL, JOHN_WICK_FROM_FORTNITE, YOUTUBE_BUDDY, SUSAN_WOJICKI, THE_POKEMON_COMPANY, POKEMON, VLADIMIR_PUTIN, GLOBGOGABGALAB_THE_SCHWABBLE_DABBLE_WABBLE_GABBLE_FLIBBA_BLABBA_BLAB, GLIB_A, SMASH_MOUTH, SHREK, SCOTLANDIA, DIHYDROGEN_MONOXIDE, BIG_CHUNGUS, SMALL_CHUNGUS, MEDIUM_CHUNGUS, REGGIE, EXPLOSIVE_ORDINANCE, SENTRY, SCENT_TREE, GENETIC_LIFEFORM_AND_DISK_OPERATING_SYSTEM, LITAJICI_KAMEN, MAYONNAISE, IRELAND, H3NTAI, CHAD_THUNDERCOCK, CATGIRL, SLIGHTLY_TECHNOLOGICALLY_EDITED_MALE, AVAST_ANTIVIRUS, STURMGEWEHR_1944, FUCKING_UHHHH, PAPRIKA
    }

    private User(Builder b){
        jmeno = b.jmeno;
        prijmeni = b.prijmeni;
        birthyear = b.birthyear;
        nick = b.nick;
        password = b.password;
        phone = b.phone;
        gender = b.gender;
    }

    public static class Builder{
        private String jmeno;
        private String prijmeni;
        private int birthyear;
        private String nick;
        private String password;
        private int phone;
        private genders gender;

        public Builder(String nick, String password){
            this.nick = nick;
            this.password = password;
        }

        public Builder jmeno(String nam) {
            jmeno = nam;
            return this;
        }

        public Builder prijmeni(String pnam){
            prijmeni = pnam;
            return this;
        }

        public Builder birthyear(int byr){
            birthyear = byr;
            return this;
        }

        public Builder phone(int phn) {
            phone = phn;
            return this;
        }

        public Builder gender(genders gndr){
            gender = gndr;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    /*
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setGender(genders gender){
        this.gender = gender;
    }
    */
}

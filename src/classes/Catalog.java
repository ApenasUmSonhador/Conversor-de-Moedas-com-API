package classes;

/*
 * Catalog class to show the available currency codes
 * @param showCatalog: Method to show the available currency codes
 * @param reader: Reader object to read the user input
 * @param reader.yesNo: Method to read a yes or no answer from the user
 */
public class Catalog {
    // Show the available currency codes
    public void showCatalog(Reader reader) {
        System.out.println("Necessita ver o catálogo de código de moedas disponíveis? (S/N)");
        if (reader.yesNo()) {
            System.out.println("-----------------------------");
            System.out.println("Códigos de moedas disponíveis:");
            System.out.println("-----------------------------");
            System.out.println("AED - United Arab Emirates Dirham");
            System.out.println("AFN - Afghan Afghani");
            System.out.println("ALL - Albanian Lek");
            System.out.println("AMD - Armenian Dram");
            System.out.println("ANG - Netherlands Antillean Guilder");
            System.out.println("AOA - Angolan Kwanza");
            System.out.println("ARS - Argentine Peso");
            System.out.println("AUD - Australian Dollar");
            System.out.println("AWG - Aruban Florin");
            System.out.println("AZN - Azerbaijani Manat");
            System.out.println("BAM - Bosnia And Herzegovina Convertible Mark");
            System.out.println("BBD - Barbadian Dollar");
            System.out.println("BDT - Bangladeshi Taka");
            System.out.println("BGN - Bulgarian Lev");
            System.out.println("BHD - Bahraini Dinar");
            System.out.println("BIF - Burundian Franc");
            System.out.println("BMD - Bermudian Dollar");
            System.out.println("BND - Brunei Dollar");
            System.out.println("BOB - Bolivian Boliviano");
            System.out.println("BRL - Brazilian Real");
            System.out.println("BSD - Bahamian Dollar");
            System.out.println("BTN - Bhutanese Ngultrum");
            System.out.println("BWP - Botswana Pula");
            System.out.println("BYN - Belarusian Ruble");
            System.out.println("BZD - Belize Dollar");
            System.out.println("CAD - Canadian Dollar");
            System.out.println("CDF - Congolese Franc");
            System.out.println("CHF - Swiss Franc");
            System.out.println("CLP - Chilean Peso");
            System.out.println("CNY - Chinese Yuan");
            System.out.println("COP - Colombian Peso");
            System.out.println("CRC - Costa Rican Colón");
            System.out.println("CUP - Cuban Peso");
            System.out.println("CVE - Cape Verdean Escudo");
            System.out.println("CZK - Czech Koruna");
            System.out.println("DJF - Djiboutian Franc");
            System.out.println("DKK - Danish Krone");
            System.out.println("DOP - Dominican Peso");
            System.out.println("DZD - Algerian Dinar");
            System.out.println("EGP - Egyptian Pound");
            System.out.println("ERN - Eritrean Nakfa");
            System.out.println("ETB - Ethiopian Birr");
            System.out.println("EUR - Euro");
            System.out.println("FJD - Fijian Dollar");
            System.out.println("FKP - Falkland Islands Pound");
            System.out.println("FOK - Faroese Króna");
            System.out.println("GBP - British Pound Sterling");
            System.out.println("GEL - Georgian Lari");
            System.out.println("GGP - Guernsey Pound");
            System.out.println("GHS - Ghanaian Cedi");
            System.out.println("GIP - Gibraltar Pound");
            System.out.println("GMD - Gambian Dalasi");
            System.out.println("GNF - Guinean Franc");
            System.out.println("GTQ - Guatemalan Quetzal");
            System.out.println("GYD - Guyanaese Dollar");
            System.out.println("HKD - Hong Kong Dollar");
            System.out.println("HNL - Honduran Lempira");
            System.out.println("HRK - Croatian Kuna");
            System.out.println("HTG - Haitian Gourde");
            System.out.println("HUF - Hungarian Forint");
            System.out.println("IDR - Indonesian Rupiah");
            System.out.println("ILS - Israeli New Sheqel");
            System.out.println("IMP - Isle");
            System.out.println("INR - Indian Rupee");
            System.out.println("IQD - Iraqi Dinar");
            System.out.println("IRR - Iranian Rial");
            System.out.println("ISK - Icelandic Króna");
            System.out.println("JEP - Jersey Pound");
            System.out.println("JMD - Jamaican Dollar");
            System.out.println("JOD - Jordanian Dinar");
            System.out.println("JPY - Japanese Yen");
            System.out.println("KES - Kenyan Shilling");
            System.out.println("KGS - Kyrgyzstani Som");
            System.out.println("KHR - Cambodian Riel");
            System.out.println("KID - Kiribati Dollar");
            System.out.println("KMF - Comorian Franc");
            System.out.println("KRW - South Korean Won");
            System.out.println("KWD - Kuwaiti Dinar");
            System.out.println("KYD - Cayman Islands Dollar");
            System.out.println("KZT - Kazakhstani Tenge");
            System.out.println("LAK - Laotian Kip");
            System.out.println("LBP - Lebanese Pound");
            System.out.println("LKR - Sri Lankan Rupee");
            System.out.println("LRD - Liberian Dollar");
            System.out.println("LSL - Lesotho Loti");
            System.out.println("LYD - Libyan Dinar");
            System.out.println("MAD - Moroccan Dirham");
            System.out.println("MDL - Moldovan Leu");
            System.out.println("MGA - Malagasy Ariary");
            System.out.println("MKD - Macedonian Denar");
            System.out.println("MMK - Myanma Kyat");
            System.out.println("MNT - Mongolian Tugrik");
            System.out.println("MOP - Macanese Pataca");
            System.out.println("MRU - Mauritanian Ouguiya");
            System.out.println("MUR - Mauritian Rupee");
            System.out.println("MVR - Maldivian Rufiyaa");
            System.out.println("MWK - Malawian Kwacha");
            System.out.println("MXN - Mexican Peso");
            System.out.println("MYR - Malaysian Ringgit");
            System.out.println("MZN - Mozambican Metical");
            System.out.println("NAD - Namibian Dollar");
            System.out.println("NGN - Nigerian Naira");
            System.out.println("NIO - Nicaraguan Córdoba");
            System.out.println("NOK - Norwegian Krone");
            System.out.println("NPR - Nepalese Rupee");
            System.out.println("NZD - New Zealand Dollar");
            System.out.println("OMR - Omani Rial");
            System.out.println("PAB - Panamanian Balboa");
            System.out.println("PEN - Peruvian Nuevo Sol");
            System.out.println("PGK - Papua New Guinean Kina");
            System.out.println("PHP - Philippine Peso");
            System.out.println("PKR - Pakistani Rupee");
            System.out.println("PLN - Polish Zloty");
            System.out.println("PYG - Paraguayan Guarani");
            System.out.println("QAR - Qatari Rial");
            System.out.println("RON - Romanian Leu");
            System.out.println("RSD - Serbian Dinar");
            System.out.println("RUB - Russian Ruble");
            System.out.println("RWF - Rwandan Franc");
            System.out.println("SAR - Saudi Riyal");
            System.out.println("SBD - Solomon Islands Dollar");
            System.out.println("SCR - Seychellois Rupee");
            System.out.println("SDG - Sudanese Pound");
            System.out.println("SEK - Swedish Krona");
            System.out.println("SGD - Singapore Dollar");
            System.out.println("SHP - Saint Helena Pound");
            System.out.println("SLL - Sierra Leonean Leone");
            System.out.println("SOS - Somali Shilling");
            System.out.println("SRD - Surinamese Dollar");
            System.out.println("SSP - South Sudanese Pound");
            System.out.println("STN - São Tomé and Príncipe Dobra");
            System.out.println("SYP - Syrian Pound");
            System.out.println("SZL - Swazi Lilangeni");
            System.out.println("THB - Thai Baht");
            System.out.println("TJS - Tajikistani Somoni");
            System.out.println("TMT - Turkmenistani Manat");
            System.out.println("TND - Tunisian Dinar");
            System.out.println("TOP - Tongan Pa'anga");
            System.out.println("TRY - Turkish Lira");
            System.out.println("TTD - Trinidad and Tobago Dollar");
            System.out.println("TVD - Tuvaluan Dollar");
            System.out.println("TWD - New Taiwan Dollar");
            System.out.println("TZS - Tanzanian Shilling");
            System.out.println("UAH - Ukrainian Hryvnia");
            System.out.println("UGX - Ugandan Shilling");
            System.out.println("USD - United States Dollar");
            System.out.println("UYU - Uruguayan Peso");
            System.out.println("UZS - Uzbekistan Som");
            System.out.println("VES - Venezuelan Bolívar");
            System.out.println("VND - Vietnamese Dong");
            System.out.println("VUV - Vanuatu Vatu");
            System.out.println("WST - Samoan Tala");
            System.out.println("XAF - Central African CFA Franc");
            System.out.println("XCD - East Caribbean Dollar");
            System.out.println("XDR - Special Drawing Rights");
            System.out.println("XOF - West African CFA Franc");
            System.out.println("XPF - CFP Franc");
            System.out.println("YER - Yemeni Rial");
            System.out.println("ZAR - South African Rand");
            System.out.println("ZMW - Zambian Kwacha");
            System.out.println("ZWL - Zimbabwean Dollar");
            System.out.println("-----------------------------");
        }
    }
}
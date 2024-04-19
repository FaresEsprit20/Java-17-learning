package com.learning.procedural_and_intro.strings2;

public class RegexConstants {

  // Common regex
  public static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
  public static final String USERNAME_REGEX = "^[a-zA-Z0-9_]{3,20}$"; // length here is specified from 3 to 20 characters
  public static final String FULL_NAME_REGEX = "^[a-zA-Z\\s]{2,50}$"; // length here is specified from 2 to 50 characters
  public static final String ALPHABETIC_REGEX = "^[a-zA-Z]+$";
  public static final String NUMERIC_REGEX = "^[0-9]+$";
  public static final String ALPHANUMERIC_DOT_REGEX = "^[a-zA-Z0-9.]+$";

  // Password (at least 8 characters, with at least one uppercase letter, one lowercase letter, one digit, and one special character)
  public static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";

  // URL (http, https, ftp)
  public static final String URL_REGEX = "^(https?|ftp):\\/\\/[\\w\\d\\-_]+(\\.[\\w\\d\\-_]+)*(\\:\\d+)?(\\/[^\\s]*)?$";

  // Date (YYYY-MM-DD format)
  public static final String DATE_REGEX = "^\\d{4}-\\d{2}-\\d{2}$";

  // Phone Number (8 digits)
  public static final String PHONE_REGEX = "^\\d{8}$";

  // ZIP Code
  public static final String ZIP_CODE_REGEX = "^\\d{5}(?:[-\\s]\\d{4})?$";

  // IPv4 Address
  public static final String IPV4_REGEX = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

  // Credit Card Number
  public static final String CREDIT_CARD_REGEX = "^\\d{4}-?\\d{4}-?\\d{4}-?\\d{4}$";

  // Hex Color Code
  public static final String HEX_COLOR_REGEX = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";

  // HTML Tag
  public static final String HTML_TAG_REGEX = "<([a-zA-Z]+)(\\s*\\S+(=\"[^\"]*\"|='[^']*'|[^>]*))*\\s*/?>";

  // Positive Integer
  public static final String POSITIVE_INTEGER_REGEX = "^[1-9]\\d*$";

  // Integer
  public static final String INTEGER_REGEX = "^[+-]?\\d+$";

  // Time in HH:MM format
  public static final String TIME_REGEX = "^([01]?\\d|2[0-3]):[0-5]\\d$";

  // Credit Card Expiry Date (MM/YYYY)
  public static final String CREDIT_CARD_EXPIRY_REGEX = "^(0[1-9]|1[0-2])/(20[2-9]\\d)$";

  // MAC Address
  public static final String MAC_ADDRESS_REGEX = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$";

  // File Extension
  public static final String FILE_EXTENSION_REGEX = "\\.(?i)(txt|pdf|docx?)$";

  // IPv6 Address
  public static final String IPV6_REGEX = "^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";

  // JWT (JSON Web Token)
  public static final String JWT_REGEX = "^[A-Za-z0-9-_]+?\\.[A-Za-z0-9-_]+?\\.[A-Za-z0-9-_.+/=]*$";

  // YouTube Video ID
  public static final String YOUTUBE_VIDEO_ID_REGEX = "^[a-zA-Z0-9_-]{11}$";

  // UUID (Universally Unique Identifier)
  public static final String UUID_REGEX = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[1-5][0-9a-fA-F]{3}-[89ABab][0-9a-fA-F]{3}-[0-9a-fA-F]{12}$";

  // Roman Numerals
  public static final String ROMAN_NUMERALS_REGEX = "^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

  // HTML Color Code (repeated, as it was in the original code)
  public static final String HTML_COLOR_REGEX2 = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";

  // Social Media Username
  public static final String SOCIAL_MEDIA_USERNAME_REGEX = "^[a-zA-Z0-9_.-]{3,20}$";

  // Positive or Negative Decimal Number
  public static final String DECIMAL_NUMBER_REGEX = "^[+-]?\\d*\\.?\\d+$";

  // Bank Account Number
  public static final String BANK_ACCOUNT_NUMBER_REGEX = "^[0-9]{8,20}$";

  // ISBN (International Standard Book Number)
  public static final String ISBN_REGEX = "^(\\d{10}|\\d{13})$";

  // Credit Card CVV (Card Verification Value)
  public static final String CREDIT_CARD_CVV_REGEX = "^\\d{3,4}$";

  // Number with Commas
  public static final String NUMBER_WITH_COMMAS_REGEX = "^[1-9]\\d{0,2}(,\\d{3})*(\\.\\d+)?$";

  // Package Name
  public static final String PACKAGE_NAME_REGEX = "^[a-zA-Z_][a-zA-Z0-9_]*(\\.[a-zA-Z_][a-zA-Z0-9_]*)*$";

}

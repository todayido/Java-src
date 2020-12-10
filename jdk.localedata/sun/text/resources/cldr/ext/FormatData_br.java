/*
 * Copyright (c) 2012, 2020, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (C) 1991-2016 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in 
 * http://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that
 * (a) this copyright and permission notice appear with all copies 
 * of the Data Files or Software,
 * (b) this copyright and permission notice appear in associated 
 * documentation, and
 * (c) there is clear notice in each modified Data File or in the Software
 * as well as in the documentation associated with the Data File(s) or
 * Software that the data or software has been modified.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.text.resources.cldr.ext;

import java.util.ListResourceBundle;

public class FormatData_br extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_MonthNames = new String[] {
               "Genver",
               "C\u02bchwevrer",
               "Meurzh",
               "Ebrel",
               "Mae",
               "Mezheven",
               "Gouere",
               "Eost",
               "Gwengolo",
               "Here",
               "Du",
               "Kerzu",
               "",
            };
        final String[] metaValue_MonthAbbreviations = new String[] {
               "Gen.",
               "C\u02bchwe.",
               "Meur.",
               "Ebr.",
               "Mae",
               "Mezh.",
               "Goue.",
               "Eost",
               "Gwen.",
               "Here",
               "Du",
               "Kzu.",
               "",
            };
        final String[] metaValue_MonthNarrows = new String[] {
               "01",
               "02",
               "03",
               "04",
               "05",
               "06",
               "07",
               "08",
               "09",
               "10",
               "11",
               "12",
               "",
            };
        final String[] metaValue_DayNames = new String[] {
               "Sul",
               "Lun",
               "Meurzh",
               "Merc\u02bcher",
               "Yaou",
               "Gwener",
               "Sadorn",
            };
        final String[] metaValue_DayAbbreviations = new String[] {
               "Sul",
               "Lun",
               "Meu.",
               "Mer.",
               "Yaou",
               "Gwe.",
               "Sad.",
            };
        final String[] metaValue_DayNarrows = new String[] {
               "Su",
               "L",
               "Mz",
               "Mc",
               "Y",
               "G",
               "Sa",
            };
        final String[] metaValue_QuarterNames = new String[] {
               "1a\u00f1 trimiziad",
               "2l trimiziad",
               "3e trimiziad",
               "4e trimiziad",
            };
        final String[] metaValue_QuarterAbbreviations = new String[] {
               "1a\u00f1 trim.",
               "2l trim.",
               "3e trim.",
               "4e trim.",
            };
        final String[] metaValue_QuarterNarrows = new String[] {
               "1",
               "2",
               "3",
               "4",
            };
        final String[] metaValue_AmPmMarkers = new String[] {
               "A.M.",
               "G.M.",
            };
        final String[] metaValue_narrow_AmPmMarkers = new String[] {
               "am",
               "gm",
            };
        final String[] metaValue_Eras = new String[] {
               "a-raok J.K.",
               "goude J.K.",
            };
        final String[] metaValue_TimePatterns = new String[] {
               "HH:mm:ss zzzz",
               "HH:mm:ss z",
               "HH:mm:ss",
               "HH:mm",
            };
        final String[] metaValue_DateTimePatterns = new String[] {
               "{1} 'da' {0}",
               "{1} 'da' {0}",
               "{1}, {0}",
               "{1} {0}",
            };
        final String[] metaValue_java_time_buddhist_long_Eras = new String[] {
               "BC",
               "amzervezh voudaek",
            };
        final String[] metaValue_java_time_buddhist_Eras = new String[] {
               "BC",
               "A.B.",
            };
        final String[] metaValue_java_time_buddhist_narrow_Eras = new String[] {
               "BC",
               "AB",
            };
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
               "EEEE d MMMM y G",
               "d MMMM y G",
               "d MMM y G",
               "dd/MM/y GGGG",
            };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
               "EEEE d MMMM y GGGG",
               "d MMMM y GGGG",
               "d MMM y GGGG",
               "dd/MM/y GGGG",
            };
        final String[] metaValue_java_time_japanese_long_Eras = new String[] {
               "goude Jezuz-Krist",
               "Meiji",
               "Taish\u014d",
               "Sh\u014dwa",
               "Heisei",
               "Reiwa",
            };
        final String[] metaValue_java_time_japanese_Eras = new String[] {
               "goude J.K.",
               "Meiji",
               "Taish\u014d",
               "Sh\u014dwa",
               "Heisei",
               "Reiwa",
            };
        final String[] metaValue_java_time_japanese_narrow_Eras = new String[] {
               "goude J.K.",
               "M",
               "T",
               "S",
               "H",
               "R",
            };
        final String[] metaValue_japanese_DateTimePatterns = new String[] {
               "{1} 'da' {0}",
               "{1} 'da' {0}",
               "{1}, {0}",
               "",
            };
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
               "a-raok Republik Sina",
               "Republik Sina",
            };
        final String[] metaValue_java_time_roc_Eras = new String[] {
               "a-raok R.S.",
               "R.S.",
            };
        final String metaValue_calendarname_gregorian = "deiziadur gregorian";
        final String[] metaValue_arab_NumberPatterns = new String[] {
               "#,##0.###",
               "#,##0.00\u00a0\u00a4",
               "#,##0\u00a0%",
               "#,##0.00\u00a0\u00a4",
            };
        final String[] metaValue_arabext_NumberPatterns = new String[] {
               "#,##0.###",
               "\u00a4\u00a0#,##0.00",
               "#,##0%",
               "",
            };
        final String[] metaValue_brah_NumberElements = new String[] {
               ".",
               ",",
               ";",
               "%",
               "0",
               "#",
               "-",
               "E",
               "\u2030",
               "\u221e",
               "NaN",
            };
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "calendarname.islamic-umalqura", "deiziadur islamek (Umm al-Qura)" },
            { "buddhist.narrow.Eras", metaValue_java_time_buddhist_narrow_Eras },
            { "osma.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "roc.QuarterNames", metaValue_QuarterNames },
            { "lana.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1a80",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "calendarname.islamic-civil", "deiziadur islamek keodedel" },
            { "talu.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u19d0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "gonm.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "mtei.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\uabf0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_DayAbbreviations },
            { "islamic.DayNames", metaValue_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "DateTimePatterns", metaValue_DateTimePatterns },
            { "cakm.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    "\u00a0",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "guru.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0a66",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "field.minute", "munut" },
            { "buddhist.AmPmMarkers", metaValue_AmPmMarkers },
            { "bali.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "cham.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\uaa50",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "japanese.QuarterNarrows", metaValue_QuarterNarrows },
            { "saur.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "arab.NumberElements",
                new String[] {
                    "\u066b",
                    "\u066c",
                    "\u061b",
                    "\u066a\u061c",
                    "\u0660",
                    "#",
                    "\u061c-",
                    "\u0627\u0633",
                    "\u0609",
                    "\u221e",
                    "NaN",
                }
            },
            { "beng.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "shrd.NumberElements", metaValue_brah_NumberElements },
            { "takr.NumberElements", metaValue_brah_NumberElements },
            { "islamic.DatePatterns", metaValue_buddhist_DatePatterns },
            { "deva.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0966",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "roc.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "sund.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "arabext.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "field.second", "eilenn" },
            { "islamic.MonthNarrows",
                new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12",
                    "",
                }
            },
            { "vaii.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "calendarname.islamic", "deiziadur islamek" },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "buddhist.TimePatterns", metaValue_TimePatterns },
            { "brah.NumberElements", metaValue_brah_NumberElements },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "timezone.regionFormat", "eur {0}" },
            { "olck.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1c50",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "tibt.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "khmr.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "islamic.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.DayAbbreviations", metaValue_DayAbbreviations },
            { "java.time.buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "orya.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "mymrshan.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1090",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "islamic.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "java.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\ua9d0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "TimePatterns", metaValue_TimePatterns },
            { "islamic.DayNarrows", metaValue_DayNarrows },
            { "roc.narrow.Eras", metaValue_java_time_roc_Eras },
            { "laoo.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0ed0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "sund.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1bb0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "telu.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "buddhist.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "kali.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\ua900",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "roc.DayNames", metaValue_DayNames },
            { "QuarterNarrows", metaValue_QuarterNarrows },
            { "lanatham.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic.DayAbbreviations", metaValue_DayAbbreviations },
            { "buddhist.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "java.time.buddhist.Eras", metaValue_java_time_buddhist_Eras },
            { "mong.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "tamldec.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "mymr.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "nkoo.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u07c0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "cakm.NumberElements", metaValue_brah_NumberElements },
            { "tibt.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0f20",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "DayNames", metaValue_DayNames },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "java.time.japanese.Eras", metaValue_java_time_japanese_Eras },
            { "roc.MonthNames", metaValue_MonthNames },
            { "sora.NumberElements", metaValue_brah_NumberElements },
            { "buddhist.DateTimePatterns", metaValue_DateTimePatterns },
            { "gujr.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0ae6",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "limb.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1946",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "roc.DayNarrows", metaValue_DayNarrows },
            { "shrd.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "mlym.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "java.time.buddhist.narrow.Eras", metaValue_java_time_buddhist_narrow_Eras },
            { "timezone.regionFormat.daylight", "eur ha\u00f1v {0}" },
            { "DatePatterns",
                new String[] {
                    "EEEE d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "dd/MM/y",
                }
            },
            { "islamic.TimePatterns", metaValue_TimePatterns },
            { "japanese.DateTimePatterns", metaValue_japanese_DateTimePatterns },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.DayNames", metaValue_DayNames },
            { "vaii.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\ua620",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "java.time.japanese.narrow.Eras", metaValue_java_time_japanese_narrow_Eras },
            { "field.year", "bloaz" },
            { "arabext.NumberElements",
                new String[] {
                    "\u066b",
                    "\u066c",
                    "\u061b",
                    "\u066a",
                    "\u06f0",
                    "#",
                    "\u200e-\u200e",
                    "\u00d7\u06f1\u06f0^",
                    "\u0609",
                    "\u221e",
                    "NaN",
                }
            },
            { "japanese.AmPmMarkers", metaValue_AmPmMarkers },
            { "AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.japanese.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "mtei.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "japanese.narrow.Eras", metaValue_java_time_japanese_narrow_Eras },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "takr.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "mymr.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1040",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "japanese.TimePatterns", metaValue_TimePatterns },
            { "narrow.Eras", metaValue_Eras },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "timezone.regionFormat.standard", "eur c\u02bchoa\u00f1v {0}" },
            { "tamldec.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0be6",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "japanese.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "calendarname.japanese", "deiziadur japanat" },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "beng.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u09e6",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "long.Eras",
                new String[] {
                    "a-raok Jezuz-Krist",
                    "goude Jezuz-Krist",
                }
            },
            { "roc.QuarterNarrows", metaValue_QuarterNarrows },
            { "saur.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\ua8d0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "japanese.DatePatterns", metaValue_buddhist_DatePatterns },
            { "buddhist.DayNames", metaValue_DayNames },
            { "japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "field.era", "amzervezh" },
            { "field.dayperiod", "AM/GM" },
            { "lana.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "calendarname.roc", "deiziadur Republik Sina" },
            { "field.month", "miz" },
            { "osma.NumberElements", metaValue_brah_NumberElements },
            { "java.time.japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "roc.Eras", metaValue_java_time_roc_Eras },
            { "DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNarrows", metaValue_DayNarrows },
            { "gonm.NumberElements", metaValue_brah_NumberElements },
            { "guru.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "knda.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0ce6",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "bali.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1b50",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_Eras },
            { "japanese.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "sora.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' 'miliad two:0' 'viliad few:0' 'miliad many:0' 'a' 'viliado\u00f9 other:0' 'miliad}",
                    "{one:00' 'miliad two:00' 'viliad few:00' 'miliad many:00' 'a' 'viliado\u00f9 other:00' 'miliad}",
                    "{one:000' 'miliad two:000' 'viliad few:000' 'miliad many:000' 'a' 'viliado\u00f9 other:000' 'miliad}",
                    "{one:0' 'milion two:0' 'v/milion few:0' 'milion many:0' 'a' 'v/miliono\u00f9 other:0' 'milion}",
                    "{one:00' 'milion two:00' 'v/milion few:00' 'milion many:00' 'a' 'v/miliono\u00f9 other:00' 'milion}",
                    "{one:000' 'milion two:000' 'v/milion few:000' 'milion many:000' 'a' 'v/miliono\u00f9 other:000' 'milion}",
                    "{one:0' 'miliard two:0' 'viliard few:0' 'miliard many:0' 'a' 'viliardo\u00f9 other:0' 'miliard}",
                    "{one:00' 'miliard two:00' 'viliard few:00' 'miliard many:00' 'a' 'viliardo\u00f9 other:00' 'miliard}",
                    "{one:000' 'miliard two:000' 'viliard few:000' 'miliard many:000' 'a' 'viliardo\u00f9 other:000' 'miliard}",
                    "{one:0' 'bilion two:0' 'v/bilion few:0' 'bilion many:0' 'a' 'v/biliono\u00f9 other:0' 'bilion}",
                    "{one:00' 'bilion two:00' 'v/bilion few:00' 'bilion many:00' 'a' 'v/biliono\u00f9 other:00' 'bilion}",
                    "{one:000' 'bilion two:000' 'v/bilion few:000' 'bilion many:000' 'a' 'v/biliono\u00f9 other:000' 'bilion}",
                }
            },
            { "buddhist.QuarterNarrows", metaValue_QuarterNarrows },
            { "roc.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "standalone.QuarterNames", metaValue_QuarterNames },
            { "standalone.DayNarrows", metaValue_DayNarrows },
            { "mlym.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0d66",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "lepc.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1c40",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "gujr.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "fullwide.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\uff10",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "limb.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "java.time.roc.Eras", metaValue_java_time_roc_Eras },
            { "khmr.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u17e0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "field.zone", "takad eur" },
            { "japanese.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.DateTimePatterns", metaValue_japanese_DateTimePatterns },
            { "arab.NumberPatterns", metaValue_arab_NumberPatterns },
            { "thai.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0e50",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "Eras", metaValue_Eras },
            { "lepc.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "islamic.QuarterNames", metaValue_QuarterNames },
            { "mymrshan.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "islamic.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "nkoo.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "mong.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1810",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "java.time.islamic.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "field.weekday", "deiz ar sizhun" },
            { "islamic.DateTimePatterns", metaValue_DateTimePatterns },
            { "brah.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "java.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "thai.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "fullwide.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "japanese.QuarterNames", metaValue_QuarterNames },
            { "telu.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0c66",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "olck.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "japanese.DayNames", metaValue_DayNames },
            { "knda.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "japanese.DayAbbreviations", metaValue_DayAbbreviations },
            { "lanatham.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u1a90",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "buddhist.Eras", metaValue_java_time_buddhist_Eras },
            { "laoo.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "talu.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "field.week", "sizhun" },
            { "buddhist.QuarterNames", metaValue_QuarterNames },
            { "islamic.QuarterNarrows", metaValue_QuarterNarrows },
            { "orya.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u0b66",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "roc.AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0k two:0k few:0k many:0k other:0k}",
                    "{one:00k two:00k few:00k many:00k other:00k}",
                    "{one:000k two:000k few:000k many:000k other:000k}",
                    "{one:0M two:0M few:0M many:0M other:0M}",
                    "{one:00M two:00M few:00M many:00M other:00M}",
                    "{one:000M two:000M few:000M many:000M other:000M}",
                    "{one:0G two:0G few:0G many:0G other:0G}",
                    "{one:00G two:00G few:00G many:00G other:00G}",
                    "{one:000G two:000G few:000G many:000G other:000G}",
                    "{one:0T two:0T few:0T many:0T other:0T}",
                    "{one:00T two:00T few:00T many:00T other:00T}",
                    "{one:000T two:000T few:000T many:000T other:000T}",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_DayAbbreviations },
            { "cham.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "field.hour", "eur" },
            { "calendarname.buddhist", "deiziadur boudaat" },
            { "kali.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "latn.NumberPatterns", metaValue_arab_NumberPatterns },
            { "buddhist.DayNarrows", metaValue_DayNarrows },
            { "japanese.DayNarrows", metaValue_DayNarrows },
            { "QuarterNames", metaValue_QuarterNames },
            { "roc.TimePatterns", metaValue_TimePatterns },
            { "japanese.Eras", metaValue_java_time_japanese_Eras },
            { "deva.NumberPatterns", metaValue_arabext_NumberPatterns },
            { "roc.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
        };
        return data;
    }
}

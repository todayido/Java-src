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

public class FormatData_iw extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_MonthNames = new String[] {
               "\u05d9\u05e0\u05d5\u05d0\u05e8",
               "\u05e4\u05d1\u05e8\u05d5\u05d0\u05e8",
               "\u05de\u05e8\u05e5",
               "\u05d0\u05e4\u05e8\u05d9\u05dc",
               "\u05de\u05d0\u05d9",
               "\u05d9\u05d5\u05e0\u05d9",
               "\u05d9\u05d5\u05dc\u05d9",
               "\u05d0\u05d5\u05d2\u05d5\u05e1\u05d8",
               "\u05e1\u05e4\u05d8\u05de\u05d1\u05e8",
               "\u05d0\u05d5\u05e7\u05d8\u05d5\u05d1\u05e8",
               "\u05e0\u05d5\u05d1\u05de\u05d1\u05e8",
               "\u05d3\u05e6\u05de\u05d1\u05e8",
               "",
            };
        final String[] metaValue_MonthAbbreviations = new String[] {
               "\u05d9\u05e0\u05d5\u05f3",
               "\u05e4\u05d1\u05e8\u05f3",
               "\u05de\u05e8\u05e5",
               "\u05d0\u05e4\u05e8\u05f3",
               "\u05de\u05d0\u05d9",
               "\u05d9\u05d5\u05e0\u05d9",
               "\u05d9\u05d5\u05dc\u05d9",
               "\u05d0\u05d5\u05d2\u05f3",
               "\u05e1\u05e4\u05d8\u05f3",
               "\u05d0\u05d5\u05e7\u05f3",
               "\u05e0\u05d5\u05d1\u05f3",
               "\u05d3\u05e6\u05de\u05f3",
               "",
            };
        final String[] metaValue_MonthNarrows = new String[] {
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
            };
        final String[] metaValue_DayNames = new String[] {
               "\u05d9\u05d5\u05dd \u05e8\u05d0\u05e9\u05d5\u05df",
               "\u05d9\u05d5\u05dd \u05e9\u05e0\u05d9",
               "\u05d9\u05d5\u05dd \u05e9\u05dc\u05d9\u05e9\u05d9",
               "\u05d9\u05d5\u05dd \u05e8\u05d1\u05d9\u05e2\u05d9",
               "\u05d9\u05d5\u05dd \u05d7\u05de\u05d9\u05e9\u05d9",
               "\u05d9\u05d5\u05dd \u05e9\u05d9\u05e9\u05d9",
               "\u05d9\u05d5\u05dd \u05e9\u05d1\u05ea",
            };
        final String[] metaValue_DayAbbreviations = new String[] {
               "\u05d9\u05d5\u05dd \u05d0\u05f3",
               "\u05d9\u05d5\u05dd \u05d1\u05f3",
               "\u05d9\u05d5\u05dd \u05d2\u05f3",
               "\u05d9\u05d5\u05dd \u05d3\u05f3",
               "\u05d9\u05d5\u05dd \u05d4\u05f3",
               "\u05d9\u05d5\u05dd \u05d5\u05f3",
               "\u05e9\u05d1\u05ea",
            };
        final String[] metaValue_DayNarrows = new String[] {
               "\u05d0\u05f3",
               "\u05d1\u05f3",
               "\u05d2\u05f3",
               "\u05d3\u05f3",
               "\u05d4\u05f3",
               "\u05d5\u05f3",
               "\u05e9\u05f3",
            };
        final String[] metaValue_QuarterNames = new String[] {
               "\u05e8\u05d1\u05e2\u05d5\u05df 1",
               "\u05e8\u05d1\u05e2\u05d5\u05df 2",
               "\u05e8\u05d1\u05e2\u05d5\u05df 3",
               "\u05e8\u05d1\u05e2\u05d5\u05df 4",
            };
        final String[] metaValue_QuarterAbbreviations = new String[] {
               "Q1",
               "Q2",
               "Q3",
               "Q4",
            };
        final String[] metaValue_QuarterNarrows = new String[] {
               "1",
               "2",
               "3",
               "4",
            };
        final String[] metaValue_AmPmMarkers = new String[] {
               "\u05dc\u05e4\u05e0\u05d4\u05f4\u05e6",
               "\u05d0\u05d7\u05d4\u05f4\u05e6",
            };
        final String[] metaValue_Eras = new String[] {
               "\u05dc\u05e4\u05e0\u05d4\u05f4\u05e1",
               "\u05dc\u05e1\u05e4\u05d9\u05e8\u05d4",
            };
        final String[] metaValue_TimePatterns = new String[] {
               "H:mm:ss zzzz",
               "H:mm:ss z",
               "H:mm:ss",
               "H:mm",
            };
        final String[] metaValue_java_time_buddhist_long_Eras = new String[] {
               "BC",
               "\u05d4\u05e1\u05e4\u05d9\u05e8\u05d4 \u05d4\u05d1\u05d5\u05d3\u05d4\u05d9\u05e1\u05d8\u05d9\u05ea",
            };
        final String[] metaValue_java_time_buddhist_Eras = new String[] {
               "BC",
               "BE",
            };
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
               "EEEE, d \u05d1MMMM y G",
               "d \u05d1MMMM y G",
               "d \u05d1MMM y G",
               "d.M.y GGGGG",
            };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
               "EEEE, d \u05d1MMMM y GGGG",
               "d \u05d1MMMM y GGGG",
               "d \u05d1MMM y GGGG",
               "d.M.y G",
            };
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
               "\u05dc\u05e4\u05e0\u05d9 \u05d4\u05e8\u05e4\u05d5\u05d1\u05dc\u05d9\u05e7\u05d4 \u05e9\u05dc \u05e1\u05d9\u05df",
               "\u05dc\u05e1\u05e4\u05d9\u05e8\u05ea \u05d4\u05e8\u05e4\u05d5\u05d1\u05dc\u05d9\u05e7\u05d4 \u05e9\u05dc \u05e1\u05d9\u05df",
            };
        final String[] metaValue_java_time_roc_Eras = new String[] {
               "\u05dc\u05e4\u05e0\u05d9 R.O.C",
               "R.O.C.",
            };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
               "",
               "\u05e9\u05e0\u05ea \u05d4\u05d9\u05d2\u05f3\u05e8\u05d4",
            };
        final String metaValue_calendarname_gregorian = "\u05dc\u05d5\u05d7 \u05d4\u05e9\u05e0\u05d4 \u05d4\u05d2\u05e8\u05d2\u05d5\u05e8\u05d9\u05d0\u05e0\u05d9";
        final String[] metaValue_cakm_NumberPatterns = new String[] {
               "#,##0.###",
               "\u00a4\u00a0#,##0.00",
               "#,##0%",
               "",
            };
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "field.year", "\u05e9\u05e0\u05d4" },
            { "calendarname.islamic-umalqura", "\u05dc\u05d5\u05d7 \u05d4\u05e9\u05e0\u05d4 \u05d4\u05de\u05d5\u05e1\u05dc\u05de\u05d9 \u05d0\u05d5\u05dd \u05d0\u05dc-\u05e7\u05d5\u05e8\u05d0" },
            { "japanese.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.narrow.Eras", metaValue_java_time_buddhist_Eras },
            { "AmPmMarkers", metaValue_AmPmMarkers },
            { "timezone.gmtFormat", "GMT{0}\u200e" },
            { "java.time.japanese.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.QuarterNames", metaValue_QuarterNames },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "calendarname.islamic-civil", "\u05dc\u05d5\u05d7 \u05d4\u05e9\u05e0\u05d4 \u05d4\u05de\u05d5\u05e1\u05dc\u05de\u05d9 \u05d4\u05d0\u05d6\u05e8\u05d7\u05d9" },
            { "islamic.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_TimePatterns },
            { "narrow.Eras", metaValue_Eras },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "timezone.regionFormat.standard", "\u05e9\u05e2\u05d5\u05df {0} (\u05d7\u05d5\u05e8\u05e3)" },
            { "japanese.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "calendarname.japanese", "\u05dc\u05d5\u05d7 \u05d4\u05e9\u05e0\u05d4 \u05d4\u05d9\u05e4\u05e0\u05d9" },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_DayAbbreviations },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "long.Eras",
                new String[] {
                    "\u05dc\u05e4\u05e0\u05d9 \u05d4\u05e1\u05e4\u05d9\u05e8\u05d4",
                    "\u05dc\u05e1\u05e4\u05d9\u05e8\u05d4",
                }
            },
            { "roc.QuarterNarrows", metaValue_QuarterNarrows },
            { "islamic.DayNames", metaValue_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "cakm.NumberPatterns", metaValue_cakm_NumberPatterns },
            { "DateTimePatterns",
                new String[] {
                    "{1} \u05d1\u05e9\u05e2\u05d4 {0}",
                    "{1} \u05d1\u05e9\u05e2\u05d4 {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                }
            },
            { "narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "latn.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "0",
                    "#",
                    "\u200e-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "japanese.DatePatterns", metaValue_buddhist_DatePatterns },
            { "buddhist.DayNames", metaValue_DayNames },
            { "field.minute", "\u05d3\u05e7\u05d4" },
            { "field.era", "\u05ea\u05e7\u05d5\u05e4\u05d4" },
            { "buddhist.AmPmMarkers", metaValue_AmPmMarkers },
            { "field.dayperiod", "\u05dc\u05e4\u05e0\u05d4\u05f4\u05e6/\u05d0\u05d7\u05d4\u05f4\u05e6" },
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
            { "islamic.MonthNames",
                new String[] {
                    "\u05de\u05d5\u05d7\u05e8\u05dd",
                    "\u05e6\u05e4\u05e8",
                    "\u05e8\u05d1\u05d9\u05e2 \u05d0\u05dc-\u05d0\u05d5\u05d5\u05dc",
                    "\u05e8\u05d1\u05d9\u05e2 \u05d0-\u05ea\u05f3\u05d0\u05e0\u05d9",
                    "\u05d2\u05f3\u05d5\u05de\u05d0\u05d3\u05d0 \u05d0\u05dc-\u05d0\u05d5\u05dc\u05d0",
                    "\u05d2\u05f3\u05d5\u05de\u05d0\u05d3\u05d0 \u05d0-\u05ea\u05f3\u05d0\u05e0\u05d9\u05d4",
                    "\u05e8\u05d2\u05f3\u05d1",
                    "\u05e9\u05e2\u05d1\u05d0\u05df",
                    "\u05e8\u05de\u05d3\u05d0\u05df",
                    "\u05e9\u05d5\u05d5\u05d0\u05dc",
                    "\u05d3\u05f3\u05d5 \u05d0\u05dc\u05be\u05e7\u05e2\u05d3\u05d4",
                    "\u05d3\u05f3\u05d5 \u05d0\u05dc\u05be\u05d7\u05d9\u05d2\u05f3\u05d4",
                    "",
                }
            },
            { "japanese.QuarterNarrows", metaValue_QuarterNarrows },
            { "calendarname.roc", "\u05dc\u05d5\u05d7 \u05d4\u05e9\u05e0\u05d4 \u05d4\u05d8\u05d9\u05d9\u05d5\u05d5\u05d0\u05e0\u05d9" },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE, d \u05d1MMMM y GGGG",
                    "d \u05d1MMMM y GGGG",
                    "d \u05d1MMM y GGGG",
                    "dd/MM/yy G",
                }
            },
            { "roc.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "field.month", "\u05d7\u05d5\u05d3\u05e9" },
            { "roc.Eras", metaValue_java_time_roc_Eras },
            { "field.second", "\u05e9\u05e0\u05d9\u05d9\u05d4" },
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
            { "DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNarrows", metaValue_DayNarrows },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "calendarname.islamic", "\u05dc\u05d5\u05d7 \u05d4\u05e9\u05e0\u05d4 \u05d4\u05de\u05d5\u05e1\u05dc\u05de\u05d9" },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_Eras },
            { "japanese.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_TimePatterns },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "timezone.regionFormat", "\u05e9\u05e2\u05d5\u05df {0}" },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:\u200f0' '\u05d0\u05dc\u05e3 two:\u200f0' '\u05d0\u05dc\u05e3 many:\u200f0' '\u05d0\u05dc\u05e3 other:\u200f0' '\u05d0\u05dc\u05e3}",
                    "{one:\u200f00' '\u05d0\u05dc\u05e3 two:\u200f00' '\u05d0\u05dc\u05e3 many:\u200f00' '\u05d0\u05dc\u05e3 other:\u200f00' '\u05d0\u05dc\u05e3}",
                    "{one:\u200f000' '\u05d0\u05dc\u05e3 two:\u200f000' '\u05d0\u05dc\u05e3 many:\u200f000' '\u05d0\u05dc\u05e3 other:\u200f000' '\u05d0\u05dc\u05e3}",
                    "{one:\u200f0' '\u05de\u05d9\u05dc\u05d9\u05d5\u05df two:\u200f0' '\u05de\u05d9\u05dc\u05d9\u05d5\u05df many:\u200f0' '\u05de\u05d9\u05dc\u05d9\u05d5\u05df other:\u200f0' '\u05de\u05d9\u05dc\u05d9\u05d5\u05df}",
                    "{one:\u200f00' '\u05de\u05d9\u05dc\u05d9\u05d5\u05df two:\u200f00' '\u05de\u05d9\u05dc\u05d9\u05d5\u05df many:\u200f00' '\u05de\u05d9\u05dc\u05d9\u05d5\u05df other:\u200f00' '\u05de\u05d9\u05dc\u05d9\u05d5\u05df}",
                    "{one:\u200f000' '\u05de\u05d9\u05dc\u05d9\u05d5\u05df two:\u200f000' '\u05de\u05d9\u05dc\u05d9\u05d5\u05df many:\u200f000' '\u05de\u05d9\u05dc\u05d9\u05d5\u05df other:\u200f000' '\u05de\u05d9\u05dc\u05d9\u05d5\u05df}",
                    "{one:\u200f0' '\u05de\u05d9\u05dc\u05d9\u05d0\u05e8\u05d3 two:\u200f0' '\u05de\u05d9\u05dc\u05d9\u05d0\u05e8\u05d3 many:\u200f0' '\u05de\u05d9\u05dc\u05d9\u05d0\u05e8\u05d3 other:\u200f0' '\u05de\u05d9\u05dc\u05d9\u05d0\u05e8\u05d3}",
                    "{one:\u200f00' '\u05de\u05d9\u05dc\u05d9\u05d0\u05e8\u05d3 two:\u200f00' '\u05de\u05d9\u05dc\u05d9\u05d0\u05e8\u05d3 many:\u200f00' '\u05de\u05d9\u05dc\u05d9\u05d0\u05e8\u05d3 other:\u200f00' '\u05de\u05d9\u05dc\u05d9\u05d0\u05e8\u05d3}",
                    "{one:\u200f000' '\u05de\u05d9\u05dc\u05d9\u05d0\u05e8\u05d3 two:\u200f000' '\u05de\u05d9\u05dc\u05d9\u05d0\u05e8\u05d3 many:\u200f000' '\u05de\u05d9\u05dc\u05d9\u05d0\u05e8\u05d3 other:\u200f000' '\u05de\u05d9\u05dc\u05d9\u05d0\u05e8\u05d3}",
                    "{one:\u200f0' '\u05d8\u05e8\u05d9\u05dc\u05d9\u05d5\u05df two:\u200f0' '\u05d8\u05e8\u05d9\u05dc\u05d9\u05d5\u05df many:\u200f0' '\u05d8\u05e8\u05d9\u05dc\u05d9\u05d5\u05df other:\u200f0' '\u05d8\u05e8\u05d9\u05dc\u05d9\u05d5\u05df}",
                    "{one:\u200f00' '\u05d8\u05e8\u05d9\u05dc\u05d9\u05d5\u05df two:\u200f00' '\u05d8\u05e8\u05d9\u05dc\u05d9\u05d5\u05df many:\u200f00' '\u05d8\u05e8\u05d9\u05dc\u05d9\u05d5\u05df other:\u200f00' '\u05d8\u05e8\u05d9\u05dc\u05d9\u05d5\u05df}",
                    "{one:\u200f000' '\u05d8\u05e8\u05d9\u05dc\u05d9\u05d5\u05df two:\u200f000' '\u05d8\u05e8\u05d9\u05dc\u05d9\u05d5\u05df many:\u200f000' '\u05d8\u05e8\u05d9\u05dc\u05d9\u05d5\u05df other:\u200f000' '\u05d8\u05e8\u05d9\u05dc\u05d9\u05d5\u05df}",
                }
            },
            { "buddhist.QuarterNarrows", metaValue_QuarterNarrows },
            { "roc.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "standalone.QuarterNames", metaValue_QuarterNames },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.DayAbbreviations", metaValue_DayAbbreviations },
            { "standalone.DayNarrows", metaValue_DayNarrows },
            { "java.time.buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "islamic.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "TimePatterns", metaValue_TimePatterns },
            { "islamic.DayNarrows", metaValue_DayNarrows },
            { "java.time.roc.Eras", metaValue_java_time_roc_Eras },
            { "field.zone", "\u05d0\u05d6\u05d5\u05e8 \u05d6\u05de\u05df" },
            { "japanese.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.narrow.Eras", metaValue_java_time_roc_Eras },
            { "buddhist.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "Eras", metaValue_Eras },
            { "roc.DayNames", metaValue_DayNames },
            { "islamic.QuarterNames", metaValue_QuarterNames },
            { "QuarterNarrows", metaValue_QuarterNarrows },
            { "islamic.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE, d \u05d1MMMM y G",
                    "d \u05d1MMMM y G",
                    "d \u05d1MMM y G",
                    "dd/MM/yy GGGGG",
                }
            },
            { "field.weekday", "\u05d9\u05d5\u05dd \u05d1\u05e9\u05d1\u05d5\u05e2" },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic.DayAbbreviations", metaValue_DayAbbreviations },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "japanese.QuarterNames", metaValue_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "java.time.buddhist.Eras", metaValue_java_time_buddhist_Eras },
            { "timezone.hourFormat", "\u200e+HH:mm;-HH:mm\u200e" },
            { "cakm.NumberElements",
                new String[] {
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
                }
            },
            { "japanese.DayNames", metaValue_DayNames },
            { "japanese.DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNames", metaValue_DayNames },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "roc.MonthNames", metaValue_MonthNames },
            { "buddhist.Eras", metaValue_java_time_buddhist_Eras },
            { "field.week", "\u05e9\u05d1\u05d5\u05e2" },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.QuarterNames", metaValue_QuarterNames },
            { "islamic.QuarterNarrows", metaValue_QuarterNarrows },
            { "roc.DayNarrows", metaValue_DayNarrows },
            { "roc.AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0K two:0K many:0K other:0K}",
                    "{one:00K two:00K many:00K other:00K}",
                    "{one:000K two:000K many:000K other:000K}",
                    "{one:0M two:0M many:0M other:0M}",
                    "{one:00M two:00M many:00M other:00M}",
                    "{one:000M two:000M many:000M other:000M}",
                    "{one:0B two:0B many:0B other:0B}",
                    "{one:00B two:00B many:00B other:00B}",
                    "{one:000B two:000B many:000B other:000B}",
                    "{one:0T two:0T many:0T other:0T}",
                    "{one:00T two:00T many:00T other:00T}",
                    "{one:000T two:000T many:000T other:000T}",
                }
            },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "java.time.buddhist.narrow.Eras", metaValue_java_time_buddhist_Eras },
            { "timezone.regionFormat.daylight", "\u05e9\u05e2\u05d5\u05df {0} (\u05e7\u05d9\u05e5)" },
            { "DatePatterns",
                new String[] {
                    "EEEE, d \u05d1MMMM y",
                    "d \u05d1MMMM y",
                    "d \u05d1MMM y",
                    "d.M.y",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_DayAbbreviations },
            { "cham.NumberPatterns", metaValue_cakm_NumberPatterns },
            { "islamic.TimePatterns", metaValue_TimePatterns },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.DayNames", metaValue_DayNames },
            { "field.hour", "\u05e9\u05e2\u05d4" },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "\u05de\u05d5\u05d7\u05e8\u05dd",
                    "\u05e6\u05e4\u05e8",
                    "\u05e8\u05d1\u05d9\u05e2 \u05d0\u05f3",
                    "\u05e8\u05d1\u05d9\u05e2 \u05d1\u05f3",
                    "\u05d2\u05f3\u05d5\u05de\u05d0\u05d3\u05d0 \u05d0\u05f3",
                    "\u05d2\u05f3\u05d5\u05de\u05d0\u05d3\u05d0 \u05d1\u05f3",
                    "\u05e8\u05d2\u05f3\u05d1",
                    "\u05e9\u05e2\u05d1\u05d0\u05df",
                    "\u05e8\u05de\u05d3\u05d0\u05df",
                    "\u05e9\u05d5\u05d5\u05d0\u05dc",
                    "\u05d3\u05f3\u05d5 \u05d0\u05dc\u05be\u05e7\u05e2\u05d3\u05d4",
                    "\u05d3\u05f3\u05d5 \u05d0\u05dc\u05be\u05d7\u05d9\u05d2\u05f3\u05d4",
                    "",
                }
            },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "calendarname.buddhist", "\u05dc\u05d5\u05d7 \u05d4\u05e9\u05e0\u05d4 \u05d4\u05d1\u05d5\u05d3\u05d4\u05d9\u05e1\u05d8\u05d9" },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u200f#,##0.00\u00a0\u00a4;\u200f-#,##0.00\u00a0\u00a4",
                    "#,##0%",
                    "#,##0.00\u00a0\u00a4",
                }
            },
            { "buddhist.DayNarrows", metaValue_DayNarrows },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "japanese.DayNarrows", metaValue_DayNarrows },
            { "QuarterNames", metaValue_QuarterNames },
            { "roc.TimePatterns", metaValue_TimePatterns },
            { "QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
        };
        return data;
    }
}

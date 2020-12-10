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

package sun.util.resources.cldr.ext;

import sun.util.resources.TimeZoneNamesBundle;

public class TimeZoneNames_en_AU extends TimeZoneNamesBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] Moscow = new String[] {
               "Moscow Standard Time",
               "MSK",
               "Moscow Daylight Time",
               "MSD",
               "Moscow Time",
               "MT",
            };
        final String[] Arabian = new String[] {
               "Arabia Standard Time",
               "AST",
               "Arabia Daylight Time",
               "ADT",
               "Arabia Time",
               "AT",
            };
        final String[] Japan = new String[] {
               "Japan Standard Time",
               "JST",
               "Japan Summer Time",
               "JDT",
               "Japan Time",
               "JT",
            };
        final String[] Africa_Eastern = new String[] {
               "Eastern Africa Time",
               "EAT",
               "Eastern African Summer Time",
               "EAST",
               "Eastern Africa Time",
               "EAT",
            };
        final String[] Taipei = new String[] {
               "Taipei Standard Time",
               "CST",
               "Taipei Summer Time",
               "CDT",
               "Taipei Time",
               "CT",
            };
        final String[] Australia_CentralWestern = new String[] {
               "Australian Central Western Standard Time",
               "ACWST",
               "Australian Central Western Daylight Time",
               "ACWDT",
               "Australian Central Western Time",
               "ACWT",
            };
        final String[] Samoa = new String[] {
               "Samoa Standard Time",
               "SST",
               "Samoa Summer Time",
               "SDT",
               "Samoa Time",
               "ST",
            };
        final String[] China = new String[] {
               "China Standard Time",
               "CST",
               "China Summer Time",
               "CDT",
               "China Time",
               "CT",
            };
        final String[] Korea = new String[] {
               "Korean Standard Time",
               "KST",
               "Korean Summer Time",
               "KDT",
               "Korea Time",
               "KT",
            };
        final String[] Australia_Western = new String[] {
               "Australian Western Standard Time",
               "AWST",
               "Australian Western Daylight Time",
               "AWDT",
               "Australian Western Time",
               "AWT",
            };
        final String[] Australia_Central = new String[] {
               "Australian Central Standard Time",
               "ACST",
               "Australian Central Daylight Time",
               "ACDT",
               "Australian Central Time",
               "ACT",
            };
        final String[] Lord_Howe = new String[] {
               "Lord Howe Standard Time",
               "LHST",
               "Lord Howe Daylight Time",
               "LHDT",
               "Lord Howe Time",
               "LHT",
            };
        final String[] New_Zealand = new String[] {
               "New Zealand Standard Time",
               "NZST",
               "New Zealand Daylight Time",
               "NZDT",
               "New Zealand Time",
               "NZT",
            };
        final String[] Cook = new String[] {
               "Cook Island Standard Time",
               "CKT",
               "Cook Island Summer Time",
               "CKHST",
               "Cook Island Time",
               "CKT",
            };
        final String[] Australia_Eastern = new String[] {
               "Australian Eastern Standard Time",
               "AEST",
               "Australian Eastern Daylight Time",
               "AEDT",
               "Australian Eastern Time",
               "AET",
            };
        final Object[][] data = new Object[][] {
            { "Africa/Casablanca",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                }
            },
            { "Asia/Tokyo", Japan },
            { "Asia/Shanghai", China },
            { "UTC",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                }
            },
            { "Asia/Aden", Arabian },
            { "Africa/Nairobi", Africa_Eastern },
            { "Asia/Riyadh", Arabian },
            { "Africa/El_Aaiun",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                }
            },
            { "Asia/Pyongyang", Korea },
            { "Pacific/Pago_Pago", Samoa },
            { "Europe/Moscow", Moscow },
            { "Asia/Harbin", China },
            { "Pacific/Rarotonga", Cook },
            { "Africa/Mogadishu", Africa_Eastern },
            { "Australia/Hobart", Australia_Eastern },
            { "Australia/Perth", Australia_Western },
            { "Australia/Darwin", Australia_Central },
            { "Asia/Famagusta",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                }
            },
            { "Asia/Baghdad", Arabian },
            { "Australia/Eucla", Australia_CentralWestern },
            { "Asia/Kuwait", Arabian },
            { "Antarctica/McMurdo", New_Zealand },
            { "Antarctica/Casey", Australia_Western },
            { "Asia/Macau", China },
            { "timezone.excity.Asia/Rangoon", "Rangoon" },
            { "Pacific/Bougainville",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                }
            },
            { "Africa/Asmera", Africa_Eastern },
            { "Europe/Ulyanovsk",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                }
            },
            { "timezone.excity.Pacific/Johnston", "Johnston" },
            { "Africa/Kampala", Africa_Eastern },
            { "Australia/Broken_Hill", Australia_Central },
            { "Europe/Minsk", Moscow },
            { "Pacific/Auckland", New_Zealand },
            { "Asia/Qatar", Arabian },
            { "Europe/Astrakhan",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                }
            },
            { "Asia/Taipei", Taipei },
            { "Africa/Juba", Africa_Eastern },
            { "Asia/Srednekolymsk",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                }
            },
            { "Australia/Currie", Australia_Eastern },
            { "Antarctica/South_Pole", New_Zealand },
            { "Australia/Melbourne", Australia_Eastern },
            { "Pacific/Midway", Samoa },
            { "Asia/Bahrain", Arabian },
            { "Asia/Chongqing", China },
            { "Europe/Saratov",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                }
            },
            { "Africa/Dar_es_Salaam", Africa_Eastern },
            { "Antarctica/Palmer",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                }
            },
            { "Asia/Seoul", Korea },
            { "Australia/Sydney", Australia_Eastern },
            { "Africa/Addis_Ababa", Africa_Eastern },
            { "Australia/Adelaide", Australia_Central },
            { "Africa/Djibouti", Africa_Eastern },
            { "Australia/Lord_Howe", Lord_Howe },
            { "Europe/Simferopol", Moscow },
            { "Indian/Antananarivo", Africa_Eastern },
            { "Australia/Lindeman", Australia_Eastern },
            { "America/Punta_Arenas",
                new String[] {
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                }
            },
            { "Australia/Brisbane", Australia_Eastern },
            { "Indian/Mayotte", Africa_Eastern },
            { "Indian/Comoro", Africa_Eastern },
        };
        return data;
    }
}

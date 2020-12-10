package com.sun.tools.jdeps.resources;

public final class jdeps_zh_CN extends java.util.ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "artifact.not.found", "\u627E\u4E0D\u5230" },
            { "err.command.set", "\u6307\u5B9A\u4E86 {0} \u548C {1} \u9009\u9879\u3002" },
            { "err.exception.message", "{0}" },
            { "err.filter.not.specified", "\u5FC5\u987B\u6307\u5B9A --package (-p), --regex (-e), --require \u9009\u9879" },
            { "err.genmoduleinfo.not.jarfile", "{0} \u662F\u65E0\u6CD5\u4F7F\u7528 --generate-module-info \u9009\u9879\u6307\u5B9A\u7684\u6A21\u5757\u5316 JAR \u6587\u4EF6" },
            { "err.genmoduleinfo.unnamed.package", "{0} \u5305\u542B\u6A21\u5757\u4E2D\u4E0D\u5141\u8BB8\u7684\u672A\u547D\u540D\u7A0B\u5E8F\u5305" },
            { "err.invalid.arg.for.option", "\u9009\u9879\u7684\u53C2\u6570\u65E0\u6548: {0}" },
            { "err.invalid.options", "{0} \u4E0D\u80FD\u4E0E {1} \u9009\u9879\u4E00\u8D77\u4F7F\u7528" },
            { "err.invalid.path", "\u65E0\u6548\u8DEF\u5F84: {0}" },
            { "err.missing.arg", "\u6CA1\u6709\u4E3A{0}\u6307\u5B9A\u503C" },
            { "err.missing.dependences", "\u7F3A\u5C11\u88AB\u4F9D\u8D56\u5BF9\u8C61\uFF1A\u5728\u6A21\u5757\u8DEF\u5F84\u548C\u7C7B\u8DEF\u5F84\u4E2D\u672A\u627E\u5230\u7C7B\u3002\n\u8981\u9690\u85CF\u6B64\u9519\u8BEF\uFF0C\u8BF7\u4F7F\u7528 --ignore-missing-deps \u7EE7\u7EED\u3002" },
            { "err.module.not.found", "\u627E\u4E0D\u5230\u6A21\u5757: {0}" },
            { "err.multirelease.jar.malformed", "\u683C\u5F0F\u9519\u8BEF\u7684\u591A\u53D1\u884C\u7248 jar, {0}, \u9519\u8BEF\u6761\u76EE: {1}" },
            { "err.multirelease.option.exists", "{0} \u4E0D\u662F\u591A\u53D1\u884C\u7248 jar \u6587\u4EF6, \u4F46\u8BBE\u7F6E\u4E86 --multi-release \u9009\u9879" },
            { "err.multirelease.option.notfound", "{0} \u662F\u591A\u53D1\u884C\u7248 jar \u6587\u4EF6, \u4F46\u672A\u8BBE\u7F6E --multi-release \u9009\u9879" },
            { "err.multirelease.version.associated", "\u7C7B {0} \u5DF2\u4E0E\u7248\u672C {1} \u5173\u8054, \u6B63\u5728\u5C1D\u8BD5\u6DFB\u52A0\u7248\u672C {2}" },
            { "err.option.after.class", "\u5FC5\u987B\u5728\u7C7B\u4E4B\u524D\u6307\u5B9A\u9009\u9879: {0}" },
            { "err.option.already.specified", "\u591A\u6B21\u6307\u5B9A\u4E86 {0} \u9009\u9879\u3002" },
            { "err.profiles.msg", "\u6CA1\u6709\u914D\u7F6E\u6587\u4EF6\u4FE1\u606F" },
            { "err.root.module.not.set", "\u6839\u6A21\u5757\u96C6\u4E3A\u7A7A" },
            { "err.unknown.option", "\u672A\u77E5\u9009\u9879: {0}" },
            { "error.prefix", "\u9519\u8BEF:" },
            { "internal.api.column.header", "JDK \u5185\u90E8 API" },
            { "inverse.transitive.dependencies.matching", "\u4E0E {0} \u5339\u914D\u7684\u9006\u5411\u8FC7\u6E21\u88AB\u4F9D\u8D56\u5BF9\u8C61" },
            { "inverse.transitive.dependencies.on", "{0} \u7684\u9006\u5411\u8FC7\u6E21\u88AB\u4F9D\u8D56\u5BF9\u8C61" },
            { "jdeps.wiki.url", "https://wiki.openjdk.java.net/display/JDK8/Java+Dependency+Analysis+Tool" },
            { "main.opt.I", "  -I\n  --inverse                     \u6839\u636E\u5176\u4ED6\u6307\u5B9A\u9009\u9879\u5206\u6790\u88AB\u4F9D\u8D56\u5BF9\u8C61,\n                                \u7136\u540E\u67E5\u627E\u76F4\u63A5\u548C\u95F4\u63A5\u4F9D\u8D56\u4E8E\u5339\u914D\n                                \u8282\u70B9\u7684\u6240\u6709 Artifact\u3002\n                                \u8FD9\u76F8\u5F53\u4E8E\u7F16\u8BD1\u65F6\u89C6\u56FE\u5206\u6790\u7684\n                                \u9006\u5411, \u8F93\u51FA\u88AB\u4F9D\u8D56\u5BF9\u8C61\u6982\u8981\u3002\n                                \u6B64\u9009\u9879\u5FC5\u987B\u4E0E --require, \n                                --package \u6216 --regex \u9009\u9879\u4E00\u8D77\u4F7F\u7528\u3002" },
            { "main.opt.P", "  -P       -profile             \u663E\u793A\u5305\u542B\u7A0B\u5E8F\u5305\u7684\u914D\u7F6E\u6587\u4EF6" },
            { "main.opt.R", "  -R\n  --recursive                   \u9012\u5F52\u904D\u5386\u6240\u6709\u8FD0\u884C\u65F6\u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002\n                                -R \u9009\u9879\u8868\u793A -filter:none\u3002\u5982\u679C\u6307\u5B9A\u4E86 -p\u3001\n                                -e\u3001-f \u9009\u9879\uFF0C\u5219\u53EA\u5206\u6790\n                                \u5339\u914D\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002" },
            { "main.opt.add-modules", "  --add-modules <\u6A21\u5757\u540D\u79F0>[,<\u6A21\u5757\u540D\u79F0>...]\n                                \u5C06\u6A21\u5757\u6DFB\u52A0\u5230\u6839\u96C6\u4EE5\u8FDB\u884C\u5206\u6790" },
            { "main.opt.apionly", "  -apionly\n  --api-only                    \u901A\u8FC7\u516C\u5171\u7C7B (\u5305\u62EC\u5B57\u6BB5\u7C7B\u578B, \u65B9\u6CD5\n                                \u53C2\u6570\u7C7B\u578B, \u8FD4\u56DE\u7C7B\u578B, \u53D7\u63A7\u5F02\u5E38\u9519\u8BEF\n                                \u7C7B\u578B\u7B49) \u7684\u516C\u5171\u548C\u53D7\u4FDD\u62A4\u6210\u5458\u7684\u7B7E\u540D\n                                \u9650\u5236\u5BF9 API (\u5373\u88AB\u4F9D\u8D56\u5BF9\u8C61)\n                                \u8FDB\u884C\u5206\u6790\u3002" },
            { "main.opt.check", "  --check <\u6A21\u5757\u540D\u79F0>[,<\u6A21\u5757\u540D\u79F0>...\n                                \u5206\u6790\u6307\u5B9A\u6A21\u5757\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\n                                \u5B83\u8F93\u51FA\u6A21\u5757\u63CF\u8FF0\u7B26, \u5206\u6790\u4E4B\u540E\n                                \u751F\u6210\u7684\u6A21\u5757\u88AB\u4F9D\u8D56\u5BF9\u8C61\u4EE5\u53CA\n                                \u8F6C\u6362\u51CF\u5C11\u4E4B\u540E\u7684\u56FE\u5F62\u3002\u5B83\u8FD8\n                                \u6307\u793A\u4EFB\u4F55\u672A\u4F7F\u7528\u7684\u5408\u683C\u5BFC\u51FA\u3002" },
            { "main.opt.compile-time", "  --compile-time                \u8FC7\u6E21\u88AB\u4F9D\u8D56\u5BF9\u8C61\u7684\u7F16\u8BD1\u65F6\u89C6\u56FE,\n                                \u4F8B\u5982 -R \u9009\u9879\u7684\u7F16\u8BD1\u65F6\u89C6\u56FE\u3002\n                                \u6839\u636E\u5176\u4ED6\u6307\u5B9A\u9009\u9879\u5206\u6790\u88AB\u4F9D\u8D56\u5BF9\u8C61\n                                \u5982\u679C\u4ECE\u76EE\u5F55, JAR \u6587\u4EF6\u6216\u6A21\u5757\u4E2D\n                                \u627E\u5230\u88AB\u4F9D\u8D56\u5BF9\u8C61, \u5219\u5C06\u5206\u6790\n                                \u8BE5\u6240\u5728\u6863\u6848\u4E2D\u7684\u6240\u6709\u7C7B\u3002" },
            { "main.opt.cp", "  -cp <\u8DEF\u5F84>\n  -classpath <\u8DEF\u5F84>\n  --class-path <\u8DEF\u5F84>           \u6307\u5B9A\u67E5\u627E\u7C7B\u6587\u4EF6\u7684\u4F4D\u7F6E" },
            { "main.opt.depth", "  -depth=<\u6DF1\u5EA6>                 \u6307\u5B9A\u8FC7\u6E21\u88AB\u4F9D\u8D56\u5BF9\u8C61\u5206\u6790\n                                \u7684\u6DF1\u5EA6" },
            { "main.opt.dotoutput", "  -dotoutput <\u76EE\u5F55>\n  --dot-output <\u76EE\u5F55>            DOT \u6587\u4EF6\u8F93\u51FA\u7684\u76EE\u6807\u76EE\u5F55" },
            { "main.opt.e", "  -e <\u6B63\u5219\u8868\u8FBE\u5F0F>\n  -regex <\u6B63\u5219\u8868\u8FBE\u5F0F>\n  --regex <\u6B63\u5219\u8868\u8FBE\u5F0F>               \u67E5\u627E\u4E0E\u6307\u5B9A\u6A21\u5F0F\u5339\u914D\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002" },
            { "main.opt.f", "  -f <\u6B63\u5219\u8868\u8FBE\u5F0F>  -filter <\u6B63\u5219\u8868\u8FBE\u5F0F>    \u7B5B\u9009\u4E0E\u6307\u5B9A\u6A21\u5F0F\u5339\u914D\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002\n                                    \u5982\u679C\u591A\u6B21\u6307\u5B9A, \u5219\u5C06\u4F7F\u7528\u6700\u540E\u4E00\u4E2A\n                                    \u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002\n  -filter:package                   \u7B5B\u9009\u4F4D\u4E8E\u540C\u4E00\u7A0B\u5E8F\u5305\u5185\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002\n                                    \u8FD9\u662F\u9ED8\u8BA4\u503C\u3002\n  -filter:archive                   \u7B5B\u9009\u4F4D\u4E8E\u540C\u4E00\u6863\u6848\u5185\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002\n  -filter:module                \u7B5B\u9009\u4F4D\u4E8E\u540C\u4E00\u6A21\u5757\u5185\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002\n  -filter:none                  \u4E0D\u4F7F\u7528 -filter:package \u548C -filter:archive \u7B5B\u9009\u3002\n                                    \u901A\u8FC7 -filter \u9009\u9879\u6307\u5B9A\u7684\u7B5B\u9009\n                                    \u4ECD\u65E7\u9002\u7528\u3002\n" },
            { "main.opt.generate-module-info", "  --generate-module-info <\u76EE\u5F55> \u5728\u6307\u5B9A\u76EE\u5F55\u4E0B\u751F\u6210 module-info.java\u3002\n                                \u5C06\u5206\u6790\u6307\u5B9A\u7684 JAR \u6587\u4EF6\u3002\n                                \u6B64\u9009\u9879\u4E0D\u80FD\u4E0E --dot-output \n                                \u6216 --class-path \u4E00\u8D77\u4F7F\u7528\u3002\u5BF9\u6253\u5F00\u7684\n                                \u6A21\u5757\u4F7F\u7528 --generate-open-module \u9009\u9879\u3002" },
            { "main.opt.generate-open-module", "  --generate-open-module <dir>  \u4EE5\u6253\u5F00\u6A21\u5757\u7684\u65B9\u5F0F\u4E3A\u6307\u5B9A\u76EE\u5F55\u4E0B\u7684\n                                \u6307\u5B9A JAR \u6587\u4EF6\u751F\u6210 module-info.java\u3002\n                                \u6B64\u9009\u9879\u4E0D\u80FD\u4E0E --dot-output \u6216\n                                --class-path \u4E00\u8D77\u4F7F\u7528\u3002" },
            { "main.opt.h", "  -h -? --help                  \u8F93\u51FA\u6B64\u5E2E\u52A9\u6D88\u606F" },
            { "main.opt.ignore-missing-deps", "  --ignore-missing-deps         \u5FFD\u7565\u7F3A\u5C11\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002" },
            { "main.opt.include", "\n\u7528\u4E8E\u7B5B\u9009\u8981\u5206\u6790\u7684\u7C7B\u7684\u9009\u9879:\n  -include <\u6B63\u5219\u8868\u8FBE\u5F0F>             \u5C06\u5206\u6790\u9650\u5236\u4E3A\u4E0E\u6A21\u5F0F\u5339\u914D\u7684\u7C7B\n                                    \u6B64\u9009\u9879\u7B5B\u9009\u8981\u5206\u6790\u7684\u7C7B\u7684\u5217\u8868\u3002\n                                    \u5B83\u53EF\u4EE5\u4E0E\u5411\u88AB\u4F9D\u8D56\u5BF9\u8C61\u5E94\u7528\u6A21\u5F0F\u7684\n                                -p \u548C -e \u7ED3\u5408\u4F7F\u7528" },
            { "main.opt.jdkinternals", "  -jdkinternals\n  --jdk-internals               \u5728 JDK \u5185\u90E8 API \u4E0A\u67E5\u627E\u7C7B\u7EA7\u522B\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002\n                                \u9664\u975E\u6307\u5B9A\u4E86 -include \u9009\u9879, \u5426\u5219\u9ED8\u8BA4\u60C5\u51B5\u4E0B,\n                                \u5B83\u5206\u6790 --class-path \u4E0A\u7684\u6240\u6709\u7C7B\u548C\u8F93\u5165\u6587\u4EF6\u3002\n                                \u6B64\u9009\u9879\u4E0D\u80FD\u4E0E -p, -e \u548C -s \u9009\u9879\n                                \u4E00\u8D77\u4F7F\u7528\u3002\n                                \u8B66\u544A: \u65E0\u6CD5\u8BBF\u95EE JDK \u5185\u90E8 API\u3002" },
            { "main.opt.list-deps", "  --list-deps                   \u5217\u51FA\u6A21\u5757\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002\u5B83\u8FD8\u4F1A\n                                \u8F93\u51FA\u5185\u90E8 API \u7A0B\u5E8F\u5305\uFF08\u5982\u679C\u5F15\u7528\uFF09\u3002\n                                \u6B64\u9009\u9879\u4F20\u9012\u5206\u6790\u7C7B\u8DEF\u5F84\u548C\u6A21\u5757\u8DEF\u5F84\n                                \u4E0A\u7684\u5E93\uFF08\u5982\u679C\u5F15\u7528\uFF09\u3002\n                                \u5C06 --no-recursive \u9009\u9879\u7528\u4E8E\n                                \u88AB\u4F9D\u8D56\u5BF9\u8C61\u7684\u975E\u4F20\u9012\u5206\u6790\u3002" },
            { "main.opt.list-reduced-deps", "  --list-reduced-deps           \u4E0E --list-deps \u76F8\u540C, \u4E0D\u5217\u51FA\n                                \u6A21\u5757\u56FE\u4E2D\u7684\u9690\u5F0F\u8BFB\u53D6\u7EF4\u8FB9\u3002\n                                \u5982\u679C\u6A21\u5757 M1 \u8BFB\u53D6 M2, \u5E76\u4E14 M2 \u9700\u8981\n                                M3 \u4E0A\u7684\u8FC7\u6E21, \u5219 M1 \u9690\u5F0F\u8BFB\u53D6 M3\n                                \u5E76\u4E14\u4E0D\u5728\u56FE\u4E2D\u663E\u793A\u3002" },
            { "main.opt.m", "\n\u6A21\u5757\u88AB\u4F9D\u8D56\u5BF9\u8C61\u5206\u6790\u9009\u9879:\n  -m <\u6A21\u5757\u540D\u79F0>\n  --module <\u6A21\u5757\u540D\u79F0>        \u6307\u5B9A\u7528\u4E8E\u5206\u6790\u7684\u6839\u6A21\u5757" },
            { "main.opt.missing-deps", "  --missing-deps                \u67E5\u627E\u7F3A\u5C11\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002\u6B64\u9009\u9879\n                                \u4E0D\u80FD\u4E0E -p\u3001-e \u548C -s \u9009\u9879\u4E00\u8D77\u4F7F\u7528\u3002" },
            { "main.opt.module-path", "  --module-path <\u6A21\u5757\u8DEF\u5F84>      \u6307\u5B9A\u6A21\u5757\u8DEF\u5F84" },
            { "main.opt.multi-release", "  --multi-release <\u7248\u672C>        \u6307\u5B9A\u5904\u7406\u591A\u53D1\u884C\u7248 jar \u6587\u4EF6\u65F6\u7684\n                                \u7248\u672C\u3002<\u7248\u672C> \u5E94\u4E3A\u5927\u4E8E\u7B49\u4E8E 9 \n                                \u7684\u6574\u6570\u6216\u57FA\u6570\u3002" },
            { "main.opt.no-recursive", "  --no-recursive                \u4E0D\u9012\u5F52\u904D\u5386\u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002" },
            { "main.opt.p", "\n\u7528\u4E8E\u7B5B\u9009\u88AB\u4F9D\u8D56\u5BF9\u8C61\u7684\u9009\u9879:\n  -p <\u7A0B\u5E8F\u5305>\n  -package <\u7A0B\u5E8F\u5305>\n  --package <\u7A0B\u5E8F\u5305>            \u67E5\u627E\u4E0E\u7ED9\u5B9A\u7A0B\u5E8F\u5305\u540D\u79F0\u5339\u914D\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\n                                (\u53EF\u591A\u6B21\u6307\u5B9A)\u3002" },
            { "main.opt.print-module-deps", "  --print-module-deps           \u4E0E --list-reduced-deps \u76F8\u540C, \u8F93\u51FA\n                                \u9017\u53F7\u5206\u9694\u7684\u6A21\u5757\u88AB\u4F9D\u8D56\u5BF9\u8C61\u5217\u8868\u3002\n                                \u6B64\u8F93\u51FA\u53EF\u7531 jlink --add-modules\n                                \u7528\u4E8E\u521B\u5EFA\u5B9A\u5236\u6620\u50CF, \u5176\u4E2D\u5305\u542B\n                                \u8FD9\u4E9B\u6A21\u5757\u53CA\u5176\u8FC7\u6E21\u88AB\u4F9D\u8D56\u5BF9\u8C61\u3002" },
            { "main.opt.q", "  -q       -quiet               \u9690\u85CF\u8B66\u544A\u6D88\u606F" },
            { "main.opt.require", "  --require <\u6A21\u5757\u540D\u79F0>          \u67E5\u627E\u4E0E\u7ED9\u5B9A\u6A21\u5757\u540D\u79F0\u5339\u914D\u7684\n                                \u88AB\u4F9D\u8D56\u5BF9\u8C61 (\u53EF\u591A\u6B21\u6307\u5B9A)\u3002--package,\n                                --regex, --requires \u662F\u4E92\u65A5\u7684\u3002" },
            { "main.opt.s", "  -s       -summary             \u4EC5\u8F93\u51FA\u88AB\u4F9D\u8D56\u5BF9\u8C61\u6982\u8981\u3002" },
            { "main.opt.system", "  --system <java \u4E3B\u76EE\u5F55>        \u6307\u5B9A\u66FF\u4EE3\u7CFB\u7EDF\u6A21\u5757\u8DEF\u5F84" },
            { "main.opt.upgrade-module-path", "  --upgrade-module-path <\u6A21\u5757\u8DEF\u5F84>  \u6307\u5B9A\u5347\u7EA7\u6A21\u5757\u8DEF\u5F84" },
            { "main.opt.v", "  -v       -verbose             \u8F93\u51FA\u6240\u6709\u7C7B\u7EA7\u522B\u88AB\u4F9D\u8D56\u5BF9\u8C61\n                                \u7B49\u540C\u4E8E -verbose:class -filter:none\u3002\n  -verbose:package              \u9ED8\u8BA4\u60C5\u51B5\u4E0B\u8F93\u51FA\u7A0B\u5E8F\u5305\u7EA7\u522B\u88AB\u4F9D\u8D56\u5BF9\u8C61, \n                                \u5176\u4E2D\u5305\u62EC\u540C\u4E00\u7A0B\u5E8F\u5305\u4E2D\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61\n  -verbose:class                \u9ED8\u8BA4\u60C5\u51B5\u4E0B\u8F93\u51FA\u7C7B\u7EA7\u522B\u88AB\u4F9D\u8D56\u5BF9\u8C61, \n                                \u5176\u4E2D\u5305\u62EC\u540C\u4E00\u7A0B\u5E8F\u5305\u4E2D\u7684\u88AB\u4F9D\u8D56\u5BF9\u8C61" },
            { "main.opt.version", "  -version --version            \u7248\u672C\u4FE1\u606F" },
            { "main.usage", "\u7528\u6CD5: {0} <\u9009\u9879> <\u8DEF\u5F84...>]\n\u5176\u4E2D <\u8DEF\u5F84> \u53EF\u4EE5\u662F .class \u6587\u4EF6, \u76EE\u5F55, JAR \u6587\u4EF6\u7684\u8DEF\u5F84\u540D\u3002\n\n\u53EF\u80FD\u7684\u9009\u9879\u5305\u62EC:" },
            { "main.usage.summary", "\u7528\u6CD5\uFF1A{0} <\u9009\u9879> <\u8DEF\u5F84...>]\n\u4F7F\u7528 --help \u5217\u51FA\u53EF\u80FD\u7684\u9009\u9879" },
            { "public.api.replacement.column.header", "\u5EFA\u8BAE\u7684\u66FF\u6362" },
            { "warn.invalid.arg", "\u8DEF\u5F84\u4E0D\u5B58\u5728: {0}" },
            { "warn.prefix", "\u8B66\u544A:" },
            { "warn.replace.useJDKInternals", "\u4E0D\u652F\u6301 JDK \u5185\u90E8 API, \u5B83\u4EEC\u4E13\u7528\u4E8E\u901A\u8FC7\u4E0D\u517C\u5BB9\u65B9\u5F0F\u6765\n\u5220\u9664\u6216\u66F4\u6539\u7684 JDK \u5B9E\u73B0, \u53EF\u80FD\u4F1A\u635F\u574F\u60A8\u7684\u5E94\u7528\u7A0B\u5E8F\u3002\n\u8BF7\u4FEE\u6539\u60A8\u7684\u4EE3\u7801, \u6D88\u9664\u4E0E\u4EFB\u4F55 JDK \u5185\u90E8 API \u7684\u76F8\u5173\u6027\u3002\n\u6709\u5173 JDK \u5185\u90E8 API \u66FF\u6362\u7684\u6700\u65B0\u66F4\u65B0, \u8BF7\u67E5\u770B:\n{0}" },
            { "warn.skipped.entry", "{0}" },
            { "warn.split.package", "\u62C6\u5206\u7A0B\u5E8F\u5305: {0} {1}" },
        };
    }
}

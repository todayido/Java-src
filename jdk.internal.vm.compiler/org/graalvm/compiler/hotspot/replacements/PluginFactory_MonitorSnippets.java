// CheckStyle: stop header check
// CheckStyle: stop line length check
// GENERATED CONTENT - DO NOT EDIT
// GENERATORS: org.graalvm.compiler.replacements.processor.ReplacementsAnnotationProcessor, org.graalvm.compiler.replacements.processor.PluginGenerator
package org.graalvm.compiler.hotspot.replacements;

import jdk.vm.ci.meta.ResolvedJavaMethod;

import java.lang.annotation.Annotation;
import org.graalvm.compiler.nodes.ValueNode;
import org.graalvm.compiler.nodes.graphbuilderconf.GraphBuilderContext;
import org.graalvm.compiler.nodes.graphbuilderconf.GeneratedInvocationPlugin;
import org.graalvm.compiler.nodes.graphbuilderconf.InvocationPlugin;
import org.graalvm.compiler.nodes.graphbuilderconf.InvocationPlugins;
import org.graalvm.compiler.nodes.graphbuilderconf.NodeIntrinsicPluginFactory;

import jdk.vm.ci.meta.JavaConstant;
import jdk.vm.ci.meta.JavaKind;
import org.graalvm.compiler.nodes.ConstantNode;

//        class: org.graalvm.compiler.hotspot.replacements.MonitorSnippets
//       method: bkpt(java.lang.Object,org.graalvm.compiler.word.Word,org.graalvm.compiler.word.Word,org.graalvm.compiler.word.Word)
// generated-by: org.graalvm.compiler.replacements.processor.GeneratedNodeIntrinsicPlugin$ConstructorPlugin
final class Plugin_MonitorSnippets_bkpt extends GeneratedInvocationPlugin {

    @Override
    public boolean execute(GraphBuilderContext b, ResolvedJavaMethod targetMethod, InvocationPlugin.Receiver receiver, ValueNode[] args) {
        if (!b.isPluginEnabled(this)) {
            return false;
        }
        ValueNode arg0 = args[0];
        ValueNode arg1 = args[1];
        ValueNode arg2 = args[2];
        ValueNode arg3 = args[3];
        org.graalvm.compiler.nodes.BreakpointNode node = new org.graalvm.compiler.nodes.BreakpointNode(arg0, arg1, arg2, arg3);
        b.add(node);
        return true;
    }
    @Override
    public Class<? extends Annotation> getSource() {
        return org.graalvm.compiler.graph.Node.NodeIntrinsic.class;
    }
}

//        class: org.graalvm.compiler.hotspot.replacements.MonitorSnippets
//       method: doProfile(org.graalvm.compiler.options.OptionValues)
// generated-by: org.graalvm.compiler.replacements.processor.GeneratedFoldPlugin
final class Plugin_MonitorSnippets_doProfile extends GeneratedInvocationPlugin {

    @Override
    public boolean execute(GraphBuilderContext b, ResolvedJavaMethod targetMethod, InvocationPlugin.Receiver receiver, ValueNode[] args) {
        if (!b.isPluginEnabled(this)) {
            return false;
        }
        if (!checkInjectedArgument(b, args[0], targetMethod)) {
            return false;
        }
        org.graalvm.compiler.options.OptionValues arg0 = b.getOptions();
        boolean result = org.graalvm.compiler.hotspot.replacements.MonitorSnippets.doProfile(arg0);
        JavaConstant constant = JavaConstant.forInt(result ? 1 : 0);
        ConstantNode node = ConstantNode.forConstant(constant, b.getMetaAccess(), b.getGraph());
        b.push(JavaKind.Int, node);
        b.notifyReplacedCall(targetMethod, node);
        return true;
    }
    @Override
    public Class<? extends Annotation> getSource() {
        return org.graalvm.compiler.api.replacements.Fold.class;
    }
}

//        class: org.graalvm.compiler.hotspot.replacements.MonitorSnippets
//       method: monitorenterStubC(org.graalvm.compiler.core.common.spi.ForeignCallDescriptor,java.lang.Object,org.graalvm.compiler.word.Word)
// generated-by: org.graalvm.compiler.replacements.processor.GeneratedNodeIntrinsicPlugin$CustomFactoryPlugin
final class Plugin_MonitorSnippets_monitorenterStubC extends GeneratedInvocationPlugin {

    @Override
    public boolean execute(GraphBuilderContext b, ResolvedJavaMethod targetMethod, InvocationPlugin.Receiver receiver, ValueNode[] args) {
        if (!b.isPluginEnabled(this)) {
            return false;
        }
        org.graalvm.compiler.core.common.type.Stamp arg0 = stamp;
        org.graalvm.compiler.core.common.spi.ForeignCallsProvider arg1 = injectedForeignCallsProvider;
        org.graalvm.compiler.core.common.spi.ForeignCallDescriptor arg2;
        if (args[0].isConstant()) {
            arg2 = snippetReflection.asObject(org.graalvm.compiler.core.common.spi.ForeignCallDescriptor.class, args[0].asJavaConstant());
        } else {
            assert b.canDeferPlugin(this) : b.getClass().toString();
            return false;
        }
        ValueNode arg3 = args[1];
        ValueNode arg4 = args[2];
        return org.graalvm.compiler.nodes.extended.ForeignCallNode.intrinsify(b, targetMethod, arg0, arg1, arg2, arg3, arg4);
    }
    @Override
    public Class<? extends Annotation> getSource() {
        return org.graalvm.compiler.graph.Node.NodeIntrinsic.class;
    }

    private final org.graalvm.compiler.core.common.spi.ForeignCallsProvider injectedForeignCallsProvider;
    private final org.graalvm.compiler.api.replacements.SnippetReflectionProvider snippetReflection;
    private final org.graalvm.compiler.core.common.type.Stamp stamp;

    Plugin_MonitorSnippets_monitorenterStubC(NodeIntrinsicPluginFactory.InjectionProvider injection) {
        this.injectedForeignCallsProvider = injection.getInjectedArgument(org.graalvm.compiler.core.common.spi.ForeignCallsProvider.class);
        this.snippetReflection = injection.getInjectedArgument(org.graalvm.compiler.api.replacements.SnippetReflectionProvider.class);
        this.stamp = injection.getInjectedStamp(void.class, false);
    }
}

//        class: org.graalvm.compiler.hotspot.replacements.MonitorSnippets
//       method: monitorexitStubC(org.graalvm.compiler.core.common.spi.ForeignCallDescriptor,java.lang.Object,org.graalvm.compiler.word.Word)
// generated-by: org.graalvm.compiler.replacements.processor.GeneratedNodeIntrinsicPlugin$CustomFactoryPlugin
final class Plugin_MonitorSnippets_monitorexitStubC extends GeneratedInvocationPlugin {

    @Override
    public boolean execute(GraphBuilderContext b, ResolvedJavaMethod targetMethod, InvocationPlugin.Receiver receiver, ValueNode[] args) {
        if (!b.isPluginEnabled(this)) {
            return false;
        }
        org.graalvm.compiler.core.common.type.Stamp arg0 = stamp;
        org.graalvm.compiler.core.common.spi.ForeignCallsProvider arg1 = injectedForeignCallsProvider;
        org.graalvm.compiler.core.common.spi.ForeignCallDescriptor arg2;
        if (args[0].isConstant()) {
            arg2 = snippetReflection.asObject(org.graalvm.compiler.core.common.spi.ForeignCallDescriptor.class, args[0].asJavaConstant());
        } else {
            assert b.canDeferPlugin(this) : b.getClass().toString();
            return false;
        }
        ValueNode arg3 = args[1];
        ValueNode arg4 = args[2];
        return org.graalvm.compiler.nodes.extended.ForeignCallNode.intrinsify(b, targetMethod, arg0, arg1, arg2, arg3, arg4);
    }
    @Override
    public Class<? extends Annotation> getSource() {
        return org.graalvm.compiler.graph.Node.NodeIntrinsic.class;
    }

    private final org.graalvm.compiler.core.common.spi.ForeignCallsProvider injectedForeignCallsProvider;
    private final org.graalvm.compiler.api.replacements.SnippetReflectionProvider snippetReflection;
    private final org.graalvm.compiler.core.common.type.Stamp stamp;

    Plugin_MonitorSnippets_monitorexitStubC(NodeIntrinsicPluginFactory.InjectionProvider injection) {
        this.injectedForeignCallsProvider = injection.getInjectedArgument(org.graalvm.compiler.core.common.spi.ForeignCallsProvider.class);
        this.snippetReflection = injection.getInjectedArgument(org.graalvm.compiler.api.replacements.SnippetReflectionProvider.class);
        this.stamp = injection.getInjectedStamp(void.class, false);
    }
}

//        class: org.graalvm.compiler.hotspot.replacements.MonitorSnippets
//       method: useFastInflatedLocking(org.graalvm.compiler.options.OptionValues)
// generated-by: org.graalvm.compiler.replacements.processor.GeneratedFoldPlugin
final class Plugin_MonitorSnippets_useFastInflatedLocking extends GeneratedInvocationPlugin {

    @Override
    public boolean execute(GraphBuilderContext b, ResolvedJavaMethod targetMethod, InvocationPlugin.Receiver receiver, ValueNode[] args) {
        if (!b.isPluginEnabled(this)) {
            return false;
        }
        if (!checkInjectedArgument(b, args[0], targetMethod)) {
            return false;
        }
        org.graalvm.compiler.options.OptionValues arg0 = b.getOptions();
        boolean result = org.graalvm.compiler.hotspot.replacements.MonitorSnippets.useFastInflatedLocking(arg0);
        JavaConstant constant = JavaConstant.forInt(result ? 1 : 0);
        ConstantNode node = ConstantNode.forConstant(constant, b.getMetaAccess(), b.getGraph());
        b.push(JavaKind.Int, node);
        b.notifyReplacedCall(targetMethod, node);
        return true;
    }
    @Override
    public Class<? extends Annotation> getSource() {
        return org.graalvm.compiler.api.replacements.Fold.class;
    }
}

//        class: org.graalvm.compiler.hotspot.replacements.MonitorSnippets
//       method: verifyBalancedMonitors(org.graalvm.compiler.options.OptionValues)
// generated-by: org.graalvm.compiler.replacements.processor.GeneratedFoldPlugin
final class Plugin_MonitorSnippets_verifyBalancedMonitors extends GeneratedInvocationPlugin {

    @Override
    public boolean execute(GraphBuilderContext b, ResolvedJavaMethod targetMethod, InvocationPlugin.Receiver receiver, ValueNode[] args) {
        if (!b.isPluginEnabled(this)) {
            return false;
        }
        if (!checkInjectedArgument(b, args[0], targetMethod)) {
            return false;
        }
        org.graalvm.compiler.options.OptionValues arg0 = b.getOptions();
        boolean result = org.graalvm.compiler.hotspot.replacements.MonitorSnippets.verifyBalancedMonitors(arg0);
        JavaConstant constant = JavaConstant.forInt(result ? 1 : 0);
        ConstantNode node = ConstantNode.forConstant(constant, b.getMetaAccess(), b.getGraph());
        b.push(JavaKind.Int, node);
        b.notifyReplacedCall(targetMethod, node);
        return true;
    }
    @Override
    public Class<? extends Annotation> getSource() {
        return org.graalvm.compiler.api.replacements.Fold.class;
    }
}

public class PluginFactory_MonitorSnippets implements NodeIntrinsicPluginFactory {
    @Override
    public void registerPlugins(InvocationPlugins plugins, NodeIntrinsicPluginFactory.InjectionProvider injection) {
        plugins.register(new Plugin_MonitorSnippets_bkpt(), org.graalvm.compiler.hotspot.replacements.MonitorSnippets.class, "bkpt", java.lang.Object.class, org.graalvm.compiler.word.Word.class, org.graalvm.compiler.word.Word.class, org.graalvm.compiler.word.Word.class);
        plugins.register(new Plugin_MonitorSnippets_doProfile(), org.graalvm.compiler.hotspot.replacements.MonitorSnippets.class, "doProfile", org.graalvm.compiler.options.OptionValues.class);
        plugins.register(new Plugin_MonitorSnippets_monitorenterStubC(injection), org.graalvm.compiler.hotspot.replacements.MonitorSnippets.class, "monitorenterStubC", org.graalvm.compiler.core.common.spi.ForeignCallDescriptor.class, java.lang.Object.class, org.graalvm.compiler.word.Word.class);
        plugins.register(new Plugin_MonitorSnippets_monitorexitStubC(injection), org.graalvm.compiler.hotspot.replacements.MonitorSnippets.class, "monitorexitStubC", org.graalvm.compiler.core.common.spi.ForeignCallDescriptor.class, java.lang.Object.class, org.graalvm.compiler.word.Word.class);
        plugins.register(new Plugin_MonitorSnippets_useFastInflatedLocking(), org.graalvm.compiler.hotspot.replacements.MonitorSnippets.class, "useFastInflatedLocking", org.graalvm.compiler.options.OptionValues.class);
        plugins.register(new Plugin_MonitorSnippets_verifyBalancedMonitors(), org.graalvm.compiler.hotspot.replacements.MonitorSnippets.class, "verifyBalancedMonitors", org.graalvm.compiler.options.OptionValues.class);
    }
}

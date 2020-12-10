// CheckStyle: stop header check
// CheckStyle: stop line length check
// GENERATED CONTENT - DO NOT EDIT
// GENERATORS: org.graalvm.compiler.replacements.processor.ReplacementsAnnotationProcessor, org.graalvm.compiler.replacements.processor.PluginGenerator
package org.graalvm.compiler.nodes.extended;

import jdk.vm.ci.meta.ResolvedJavaMethod;

import java.lang.annotation.Annotation;
import org.graalvm.compiler.nodes.ValueNode;
import org.graalvm.compiler.nodes.graphbuilderconf.GraphBuilderContext;
import org.graalvm.compiler.nodes.graphbuilderconf.GeneratedInvocationPlugin;
import org.graalvm.compiler.nodes.graphbuilderconf.InvocationPlugin;
import org.graalvm.compiler.nodes.graphbuilderconf.InvocationPlugins;
import org.graalvm.compiler.nodes.graphbuilderconf.NodeIntrinsicPluginFactory;

import jdk.vm.ci.meta.JavaKind;

//        class: org.graalvm.compiler.nodes.extended.RawStoreNode
//       method: storeByte(java.lang.Object,long,byte,jdk.vm.ci.meta.JavaKind,jdk.internal.vm.compiler.word.LocationIdentity)
// generated-by: org.graalvm.compiler.replacements.processor.GeneratedNodeIntrinsicPlugin$ConstructorPlugin
final class Plugin_RawStoreNode_storeByte extends GeneratedInvocationPlugin {

    @Override
    public boolean execute(GraphBuilderContext b, ResolvedJavaMethod targetMethod, InvocationPlugin.Receiver receiver, ValueNode[] args) {
        if (!b.isPluginEnabled(this)) {
            return false;
        }
        ValueNode arg0 = args[0];
        ValueNode arg1 = args[1];
        ValueNode arg2 = args[2];
        jdk.vm.ci.meta.JavaKind arg3;
        if (args[3].isConstant()) {
            arg3 = snippetReflection.asObject(jdk.vm.ci.meta.JavaKind.class, args[3].asJavaConstant());
        } else {
            assert b.canDeferPlugin(this) : b.getClass().toString();
            return false;
        }
        jdk.internal.vm.compiler.word.LocationIdentity arg4;
        if (args[4].isConstant()) {
            arg4 = snippetReflection.asObject(jdk.internal.vm.compiler.word.LocationIdentity.class, args[4].asJavaConstant());
        } else {
            assert b.canDeferPlugin(this) : b.getClass().toString();
            return false;
        }
        org.graalvm.compiler.nodes.extended.RawStoreNode node = new org.graalvm.compiler.nodes.extended.RawStoreNode(arg0, arg1, arg2, arg3, arg4);
        b.addPush(JavaKind.Object, node);
        return true;
    }
    @Override
    public Class<? extends Annotation> getSource() {
        return org.graalvm.compiler.graph.Node.NodeIntrinsic.class;
    }

    private final org.graalvm.compiler.api.replacements.SnippetReflectionProvider snippetReflection;

    Plugin_RawStoreNode_storeByte(NodeIntrinsicPluginFactory.InjectionProvider injection) {
        this.snippetReflection = injection.getInjectedArgument(org.graalvm.compiler.api.replacements.SnippetReflectionProvider.class);
    }
}

//        class: org.graalvm.compiler.nodes.extended.RawStoreNode
//       method: storeChar(java.lang.Object,long,char,jdk.vm.ci.meta.JavaKind,jdk.internal.vm.compiler.word.LocationIdentity)
// generated-by: org.graalvm.compiler.replacements.processor.GeneratedNodeIntrinsicPlugin$ConstructorPlugin
final class Plugin_RawStoreNode_storeChar extends GeneratedInvocationPlugin {

    @Override
    public boolean execute(GraphBuilderContext b, ResolvedJavaMethod targetMethod, InvocationPlugin.Receiver receiver, ValueNode[] args) {
        if (!b.isPluginEnabled(this)) {
            return false;
        }
        ValueNode arg0 = args[0];
        ValueNode arg1 = args[1];
        ValueNode arg2 = args[2];
        jdk.vm.ci.meta.JavaKind arg3;
        if (args[3].isConstant()) {
            arg3 = snippetReflection.asObject(jdk.vm.ci.meta.JavaKind.class, args[3].asJavaConstant());
        } else {
            assert b.canDeferPlugin(this) : b.getClass().toString();
            return false;
        }
        jdk.internal.vm.compiler.word.LocationIdentity arg4;
        if (args[4].isConstant()) {
            arg4 = snippetReflection.asObject(jdk.internal.vm.compiler.word.LocationIdentity.class, args[4].asJavaConstant());
        } else {
            assert b.canDeferPlugin(this) : b.getClass().toString();
            return false;
        }
        org.graalvm.compiler.nodes.extended.RawStoreNode node = new org.graalvm.compiler.nodes.extended.RawStoreNode(arg0, arg1, arg2, arg3, arg4);
        b.addPush(JavaKind.Object, node);
        return true;
    }
    @Override
    public Class<? extends Annotation> getSource() {
        return org.graalvm.compiler.graph.Node.NodeIntrinsic.class;
    }

    private final org.graalvm.compiler.api.replacements.SnippetReflectionProvider snippetReflection;

    Plugin_RawStoreNode_storeChar(NodeIntrinsicPluginFactory.InjectionProvider injection) {
        this.snippetReflection = injection.getInjectedArgument(org.graalvm.compiler.api.replacements.SnippetReflectionProvider.class);
    }
}

//        class: org.graalvm.compiler.nodes.extended.RawStoreNode
//       method: storeObject(java.lang.Object,long,java.lang.Object,jdk.vm.ci.meta.JavaKind,jdk.internal.vm.compiler.word.LocationIdentity,boolean)
// generated-by: org.graalvm.compiler.replacements.processor.GeneratedNodeIntrinsicPlugin$ConstructorPlugin
final class Plugin_RawStoreNode_storeObject extends GeneratedInvocationPlugin {

    @Override
    public boolean execute(GraphBuilderContext b, ResolvedJavaMethod targetMethod, InvocationPlugin.Receiver receiver, ValueNode[] args) {
        if (!b.isPluginEnabled(this)) {
            return false;
        }
        ValueNode arg0 = args[0];
        ValueNode arg1 = args[1];
        ValueNode arg2 = args[2];
        jdk.vm.ci.meta.JavaKind arg3;
        if (args[3].isConstant()) {
            arg3 = snippetReflection.asObject(jdk.vm.ci.meta.JavaKind.class, args[3].asJavaConstant());
        } else {
            assert b.canDeferPlugin(this) : b.getClass().toString();
            return false;
        }
        jdk.internal.vm.compiler.word.LocationIdentity arg4;
        if (args[4].isConstant()) {
            arg4 = snippetReflection.asObject(jdk.internal.vm.compiler.word.LocationIdentity.class, args[4].asJavaConstant());
        } else {
            assert b.canDeferPlugin(this) : b.getClass().toString();
            return false;
        }
        boolean arg5;
        if (args[5].isConstant()) {
            arg5 = args[5].asJavaConstant().asInt() != 0;
        } else {
            assert b.canDeferPlugin(this) : b.getClass().toString();
            return false;
        }
        org.graalvm.compiler.nodes.extended.RawStoreNode node = new org.graalvm.compiler.nodes.extended.RawStoreNode(arg0, arg1, arg2, arg3, arg4, arg5);
        b.addPush(JavaKind.Object, node);
        return true;
    }
    @Override
    public Class<? extends Annotation> getSource() {
        return org.graalvm.compiler.graph.Node.NodeIntrinsic.class;
    }

    private final org.graalvm.compiler.api.replacements.SnippetReflectionProvider snippetReflection;

    Plugin_RawStoreNode_storeObject(NodeIntrinsicPluginFactory.InjectionProvider injection) {
        this.snippetReflection = injection.getInjectedArgument(org.graalvm.compiler.api.replacements.SnippetReflectionProvider.class);
    }
}

public class PluginFactory_RawStoreNode implements NodeIntrinsicPluginFactory {
    @Override
    public void registerPlugins(InvocationPlugins plugins, NodeIntrinsicPluginFactory.InjectionProvider injection) {
        plugins.register(new Plugin_RawStoreNode_storeByte(injection), org.graalvm.compiler.nodes.extended.RawStoreNode.class, "storeByte", java.lang.Object.class, long.class, byte.class, jdk.vm.ci.meta.JavaKind.class, jdk.internal.vm.compiler.word.LocationIdentity.class);
        plugins.register(new Plugin_RawStoreNode_storeChar(injection), org.graalvm.compiler.nodes.extended.RawStoreNode.class, "storeChar", java.lang.Object.class, long.class, char.class, jdk.vm.ci.meta.JavaKind.class, jdk.internal.vm.compiler.word.LocationIdentity.class);
        plugins.register(new Plugin_RawStoreNode_storeObject(injection), org.graalvm.compiler.nodes.extended.RawStoreNode.class, "storeObject", java.lang.Object.class, long.class, java.lang.Object.class, jdk.vm.ci.meta.JavaKind.class, jdk.internal.vm.compiler.word.LocationIdentity.class, boolean.class);
    }
}

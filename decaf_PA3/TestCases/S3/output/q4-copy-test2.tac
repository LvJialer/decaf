Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
	at decaf.translate.TransPass2.visitLiteral(TransPass2.java:159)
	at decaf.tree.Tree$Literal.accept(Tree.java:1494)
	at decaf.translate.TransPass2.visitBinary(TransPass2.java:64)
	at decaf.tree.Tree$Binary.accept(Tree.java:1198)
	at decaf.translate.TransPass2.visitAssign(TransPass2.java:127)
	at decaf.tree.Tree$Assign.accept(Tree.java:1115)
	at decaf.translate.TransPass2.visitBlock(TransPass2.java:188)
	at decaf.tree.Tree$Block.accept(Tree.java:522)
	at decaf.translate.TransPass2.visitMethodDef(TransPass2.java:40)
	at decaf.tree.Tree$MethodDef.accept(Tree.java:442)
	at decaf.translate.TransPass2.visitClassDef(TransPass2.java:29)
	at decaf.tree.Tree$ClassDef.accept(Tree.java:407)
	at decaf.translate.TransPass2.visitTopLevel(TransPass2.java:48)
	at decaf.translate.Translater.translate(Translater.java:42)
	at decaf.Driver.compile(Driver.java:104)
	at decaf.Driver.main(Driver.java:117)
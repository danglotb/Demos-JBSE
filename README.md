# Demos-JBSE

Wrapping the example of running JBSE into this project

1. Get the project:

```
git clone https://github.com/danglotb/Demos-JBSE
```

2. Compile and run:

```
cd Demos-JBSE
mvn test
```

You should obtain into `out/` the file `runIf_z3.txt`, containing the report.

You can find a copy in `out/runIf_z3_copy.txt`.

Excerpt of the output:

```
.1[50591]
Leaf state, raised exception: Object[2556]
Path condition:
	{R0} == Object[0] (fresh) &&
	pre_init(smalldemos/ifx/IfExample) &&
	pre_init(java/lang/IllegalArgumentException) &&
	pre_init(java/lang/IllegalMonitorStateException) &&
	pre_init(java/lang/StackOverflowError) &&
	pre_init(java/lang/ArithmeticException) &&
	pre_init(java/lang/ArrayStoreException) &&
	pre_init(java/lang/ClassCastException) &&
	pre_init(java/lang/NullPointerException) &&
	pre_init(java/lang/OutOfMemoryError) &&
	pre_init(java/lang/VirtualMachineError) &&
	pre_init(java/lang/Error) &&
	pre_init(java/lang/ref/FinalReference) &&
	pre_init(java/lang/ref/Finalizer$FinalizerThread) &&
	pre_init(java/lang/ref/SoftReference) &&
	pre_init(java/lang/Terminator$1) &&
	pre_init(sun/misc/NativeSignalHandler) &&
	pre_init(sun/misc/OSEnvironment) &&
	pre_init(java/lang/System$2) &&
	pre_init(sun/misc/Launcher$ExtClassLoader) &&
	pre_init(java/net/URLClassLoader) &&
	pre_init(java/security/SecureClassLoader) &&
	pre_init(sun/misc/Launcher$ExtClassLoader$1) &&
	pre_init(java/security/ProtectionDomain) &&
	pre_init(java/security/CodeSource) &&
	pre_init(java/security/ProtectionDomain$Key) &&
	pre_init(java/util/WeakHashMap) &&
	pre_init(java/util/Collections$SetFromMap) &&
	pre_init(java/util/WeakHashMap$KeySet) &&
	pre_init(java/util/WeakHashMap$Entry) &&
	pre_init(java/lang/ref/WeakReference) &&
	pre_init(sun/net/www/protocol/jar/Handler) &&
	pre_init(java/net/URLStreamHandler)
	where:
	{R0} == {ROOT}:this
Static store: {
	Class[sun/nio/cs/StreamEncoder]: {
		Field[0]: Name: $assertionsDisabled, Type: Z, Value: true (type: Z)
		Field[1]: Name: DEFAULT_BYTE_BUFFER_SIZE, Type: I, Value: 8192 (type: I)
	}
	Class[sun/misc/Signal]: {
		Field[0]: Name: signals, Type: Ljava/util/Hashtable;, Value: Object[1891] (type: L)
		Field[1]: Name: handlers, Type: Ljava/util/Hashtable;, Value: Object[1889] (type: L)
	}
	.
	.
	.
```

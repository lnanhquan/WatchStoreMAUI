package crc64f6af223d8c11fa0d;


public class RichTextViewMessageHandler
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_OnMessageReceived:(Ljava/lang/String;)V:__export__\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.Controls.RichTextEditor.RichTextViewMessageHandler, Telerik.Maui.Controls", RichTextViewMessageHandler.class, __md_methods);
	}

	public RichTextViewMessageHandler ()
	{
		super ();
		if (getClass () == RichTextViewMessageHandler.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.RichTextEditor.RichTextViewMessageHandler, Telerik.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

@android.webkit.JavascriptInterface
	public void postMessage (java.lang.String p0)
	{
		n_OnMessageReceived (p0);
	}

	private native void n_OnMessageReceived (java.lang.String p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}

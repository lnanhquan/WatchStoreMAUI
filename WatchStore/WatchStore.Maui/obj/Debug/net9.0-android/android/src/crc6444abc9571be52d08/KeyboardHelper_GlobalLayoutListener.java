package crc6444abc9571be52d08;


public class KeyboardHelper_GlobalLayoutListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnGlobalLayoutListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGlobalLayout:()V:GetOnGlobalLayoutHandler:Android.Views.ViewTreeObserver/IOnGlobalLayoutListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.Controls.KeyboardHelper+GlobalLayoutListener, Telerik.Maui.Controls", KeyboardHelper_GlobalLayoutListener.class, __md_methods);
	}

	public KeyboardHelper_GlobalLayoutListener ()
	{
		super ();
		if (getClass () == KeyboardHelper_GlobalLayoutListener.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.KeyboardHelper+GlobalLayoutListener, Telerik.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public KeyboardHelper_GlobalLayoutListener (android.view.View p0, android.view.ViewTreeObserver p1)
	{
		super ();
		if (getClass () == KeyboardHelper_GlobalLayoutListener.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.KeyboardHelper+GlobalLayoutListener, Telerik.Maui.Controls", "Android.Views.View, Mono.Android:Android.Views.ViewTreeObserver, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public void onGlobalLayout ()
	{
		n_onGlobalLayout ();
	}

	private native void n_onGlobalLayout ();

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

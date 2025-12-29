package crc6444abc9571be52d08;


public class RadPopup_ObservableLayer
	extends android.widget.FrameLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_requestLayout:()V:GetRequestLayoutHandler\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.Controls.RadPopup+ObservableLayer, Telerik.Maui.Controls", RadPopup_ObservableLayer.class, __md_methods);
	}

	public RadPopup_ObservableLayer (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == RadPopup_ObservableLayer.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.RadPopup+ObservableLayer, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}

	public RadPopup_ObservableLayer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == RadPopup_ObservableLayer.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.RadPopup+ObservableLayer, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}

	public RadPopup_ObservableLayer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == RadPopup_ObservableLayer.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.RadPopup+ObservableLayer, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public RadPopup_ObservableLayer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == RadPopup_ObservableLayer.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.RadPopup+ObservableLayer, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public void requestLayout ()
	{
		n_requestLayout ();
	}

	private native void n_requestLayout ();

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

package crc64f6af223d8c11fa0d;


public class RadMauiWebView
	extends crc6452ffdc5b34af3a0f.MauiWebView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_startActionMode:(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;:GetStartActionMode_Landroid_view_ActionMode_Callback_IHandler\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.Controls.RichTextEditor.RadMauiWebView, Telerik.Maui.Controls", RadMauiWebView.class, __md_methods);
	}

	public RadMauiWebView (android.content.Context p0, android.util.AttributeSet p1, int p2, boolean p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == RadMauiWebView.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.RichTextEditor.RadMauiWebView, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Boolean, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}

	public RadMauiWebView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == RadMauiWebView.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.RichTextEditor.RadMauiWebView, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}

	public RadMauiWebView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == RadMauiWebView.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.RichTextEditor.RadMauiWebView, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}

	public RadMauiWebView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == RadMauiWebView.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.RichTextEditor.RadMauiWebView, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public RadMauiWebView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == RadMauiWebView.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.RichTextEditor.RadMauiWebView, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public android.view.ActionMode startActionMode (android.view.ActionMode.Callback p0, int p1)
	{
		return n_startActionMode (p0, p1);
	}

	private native android.view.ActionMode n_startActionMode (android.view.ActionMode.Callback p0, int p1);

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

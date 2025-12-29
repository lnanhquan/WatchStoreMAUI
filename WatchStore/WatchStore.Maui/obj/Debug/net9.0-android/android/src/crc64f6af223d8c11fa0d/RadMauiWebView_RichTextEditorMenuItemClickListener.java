package crc64f6af223d8c11fa0d;


public class RadMauiWebView_RichTextEditorMenuItemClickListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.MenuItem.OnMenuItemClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMenuItemClick:(Landroid/view/MenuItem;)Z:GetOnMenuItemClick_Landroid_view_MenuItem_Handler:Android.Views.IMenuItemOnMenuItemClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.Controls.RichTextEditor.RadMauiWebView+RichTextEditorMenuItemClickListener, Telerik.Maui.Controls", RadMauiWebView_RichTextEditorMenuItemClickListener.class, __md_methods);
	}

	public RadMauiWebView_RichTextEditorMenuItemClickListener ()
	{
		super ();
		if (getClass () == RadMauiWebView_RichTextEditorMenuItemClickListener.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.RichTextEditor.RadMauiWebView+RichTextEditorMenuItemClickListener, Telerik.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onMenuItemClick (android.view.MenuItem p0)
	{
		return n_onMenuItemClick (p0);
	}

	private native boolean n_onMenuItemClick (android.view.MenuItem p0);

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

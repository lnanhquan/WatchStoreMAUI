package crc64f6af223d8c11fa0d;


public class RadMauiWebView_RichTextEditorActionModeCallback
	extends android.view.ActionMode.Callback2
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGetContentRect:(Landroid/view/ActionMode;Landroid/view/View;Landroid/graphics/Rect;)V:GetOnGetContentRect_Landroid_view_ActionMode_Landroid_view_View_Landroid_graphics_Rect_Handler\n" +
			"n_onCreateActionMode:(Landroid/view/ActionMode;Landroid/view/Menu;)Z:GetOnCreateActionMode_Landroid_view_ActionMode_Landroid_view_Menu_Handler\n" +
			"n_onDestroyActionMode:(Landroid/view/ActionMode;)V:GetOnDestroyActionMode_Landroid_view_ActionMode_Handler\n" +
			"n_onPrepareActionMode:(Landroid/view/ActionMode;Landroid/view/Menu;)Z:GetOnPrepareActionMode_Landroid_view_ActionMode_Landroid_view_Menu_Handler\n" +
			"n_onActionItemClicked:(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z:GetOnActionItemClicked_Landroid_view_ActionMode_Landroid_view_MenuItem_Handler\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.Controls.RichTextEditor.RadMauiWebView+RichTextEditorActionModeCallback, Telerik.Maui.Controls", RadMauiWebView_RichTextEditorActionModeCallback.class, __md_methods);
	}

	public RadMauiWebView_RichTextEditorActionModeCallback ()
	{
		super ();
		if (getClass () == RadMauiWebView_RichTextEditorActionModeCallback.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.RichTextEditor.RadMauiWebView+RichTextEditorActionModeCallback, Telerik.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public void onGetContentRect (android.view.ActionMode p0, android.view.View p1, android.graphics.Rect p2)
	{
		n_onGetContentRect (p0, p1, p2);
	}

	private native void n_onGetContentRect (android.view.ActionMode p0, android.view.View p1, android.graphics.Rect p2);

	public boolean onCreateActionMode (android.view.ActionMode p0, android.view.Menu p1)
	{
		return n_onCreateActionMode (p0, p1);
	}

	private native boolean n_onCreateActionMode (android.view.ActionMode p0, android.view.Menu p1);

	public void onDestroyActionMode (android.view.ActionMode p0)
	{
		n_onDestroyActionMode (p0);
	}

	private native void n_onDestroyActionMode (android.view.ActionMode p0);

	public boolean onPrepareActionMode (android.view.ActionMode p0, android.view.Menu p1)
	{
		return n_onPrepareActionMode (p0, p1);
	}

	private native boolean n_onPrepareActionMode (android.view.ActionMode p0, android.view.Menu p1);

	public boolean onActionItemClicked (android.view.ActionMode p0, android.view.MenuItem p1)
	{
		return n_onActionItemClicked (p0, p1);
	}

	private native boolean n_onActionItemClicked (android.view.ActionMode p0, android.view.MenuItem p1);

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

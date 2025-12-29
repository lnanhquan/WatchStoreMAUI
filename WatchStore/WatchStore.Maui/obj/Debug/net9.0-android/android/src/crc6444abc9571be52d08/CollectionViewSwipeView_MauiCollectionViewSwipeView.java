package crc6444abc9571be52d08;


public class CollectionViewSwipeView_MauiCollectionViewSwipeView
	extends crc6452ffdc5b34af3a0f.LayoutViewGroup
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_requestLayout:()V:GetRequestLayoutHandler\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.Controls.CollectionViewSwipeView+MauiCollectionViewSwipeView, Telerik.Maui.Controls", CollectionViewSwipeView_MauiCollectionViewSwipeView.class, __md_methods);
	}

	public CollectionViewSwipeView_MauiCollectionViewSwipeView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == CollectionViewSwipeView_MauiCollectionViewSwipeView.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.CollectionViewSwipeView+MauiCollectionViewSwipeView, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2, p3 });
		}
	}

	public CollectionViewSwipeView_MauiCollectionViewSwipeView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == CollectionViewSwipeView_MauiCollectionViewSwipeView.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.CollectionViewSwipeView+MauiCollectionViewSwipeView, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}

	public CollectionViewSwipeView_MauiCollectionViewSwipeView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == CollectionViewSwipeView_MauiCollectionViewSwipeView.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.CollectionViewSwipeView+MauiCollectionViewSwipeView, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public CollectionViewSwipeView_MauiCollectionViewSwipeView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == CollectionViewSwipeView_MauiCollectionViewSwipeView.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.CollectionViewSwipeView+MauiCollectionViewSwipeView, Telerik.Maui.Controls", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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

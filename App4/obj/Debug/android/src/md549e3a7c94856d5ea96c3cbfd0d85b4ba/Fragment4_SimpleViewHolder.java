package md549e3a7c94856d5ea96c3cbfd0d85b4ba;


public class Fragment4_SimpleViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_toString:()Ljava/lang/String;:GetToStringHandler\n" +
			"";
		mono.android.Runtime.register ("App4.Fragments.Fragment4+SimpleViewHolder, App4", Fragment4_SimpleViewHolder.class, __md_methods);
	}


	public Fragment4_SimpleViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == Fragment4_SimpleViewHolder.class)
			mono.android.TypeManager.Activate ("App4.Fragments.Fragment4+SimpleViewHolder, App4", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public java.lang.String toString ()
	{
		return n_toString ();
	}

	private native java.lang.String n_toString ();

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

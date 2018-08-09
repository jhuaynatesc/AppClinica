package md53360f1d67078a75cdf67d9f4b750286d;


public class CitasAdapter_SimpleViewHolder
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
		mono.android.Runtime.register ("App4.Adapters.CitasAdapter+SimpleViewHolder, App4", CitasAdapter_SimpleViewHolder.class, __md_methods);
	}


	public CitasAdapter_SimpleViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == CitasAdapter_SimpleViewHolder.class)
			mono.android.TypeManager.Activate ("App4.Adapters.CitasAdapter+SimpleViewHolder, App4", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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

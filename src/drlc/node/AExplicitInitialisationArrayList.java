/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.node;

import java.util.*;
import drlc.analysis.*;

@SuppressWarnings("nls")
public final class AExplicitInitialisationArrayList extends PExplicitInitialisationArrayList
{
    private PExplicitInitialisationArray _explicitInitialisationArray_;
    private final LinkedList<PExplicitInitialisationArrayListTail> _explicitInitialisationArrayListTail_ = new LinkedList<PExplicitInitialisationArrayListTail>();

    public AExplicitInitialisationArrayList()
    {
        // Constructor
    }

    public AExplicitInitialisationArrayList(
        @SuppressWarnings("hiding") PExplicitInitialisationArray _explicitInitialisationArray_,
        @SuppressWarnings("hiding") List<?> _explicitInitialisationArrayListTail_)
    {
        // Constructor
        setExplicitInitialisationArray(_explicitInitialisationArray_);

        setExplicitInitialisationArrayListTail(_explicitInitialisationArrayListTail_);

    }

    @Override
    public Object clone()
    {
        return new AExplicitInitialisationArrayList(
            cloneNode(this._explicitInitialisationArray_),
            cloneList(this._explicitInitialisationArrayListTail_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExplicitInitialisationArrayList(this);
    }

    public PExplicitInitialisationArray getExplicitInitialisationArray()
    {
        return this._explicitInitialisationArray_;
    }

    public void setExplicitInitialisationArray(PExplicitInitialisationArray node)
    {
        if(this._explicitInitialisationArray_ != null)
        {
            this._explicitInitialisationArray_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._explicitInitialisationArray_ = node;
    }

    public LinkedList<PExplicitInitialisationArrayListTail> getExplicitInitialisationArrayListTail()
    {
        return this._explicitInitialisationArrayListTail_;
    }

    public void setExplicitInitialisationArrayListTail(List<?> list)
    {
        for(PExplicitInitialisationArrayListTail e : this._explicitInitialisationArrayListTail_)
        {
            e.parent(null);
        }
        this._explicitInitialisationArrayListTail_.clear();

        for(Object obj_e : list)
        {
            PExplicitInitialisationArrayListTail e = (PExplicitInitialisationArrayListTail) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._explicitInitialisationArrayListTail_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._explicitInitialisationArray_)
            + toString(this._explicitInitialisationArrayListTail_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._explicitInitialisationArray_ == child)
        {
            this._explicitInitialisationArray_ = null;
            return;
        }

        if(this._explicitInitialisationArrayListTail_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._explicitInitialisationArray_ == oldChild)
        {
            setExplicitInitialisationArray((PExplicitInitialisationArray) newChild);
            return;
        }

        for(ListIterator<PExplicitInitialisationArrayListTail> i = this._explicitInitialisationArrayListTail_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExplicitInitialisationArrayListTail) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}

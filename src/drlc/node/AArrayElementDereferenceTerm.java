/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.node;

import java.util.*;
import drlc.analysis.*;

@SuppressWarnings("nls")
public final class AArrayElementDereferenceTerm extends PDereferenceTerm
{
    private final LinkedList<TDereference> _dereference_ = new LinkedList<TDereference>();
    private PRvalueArrayElement _rvalueArrayElement_;

    public AArrayElementDereferenceTerm()
    {
        // Constructor
    }

    public AArrayElementDereferenceTerm(
        @SuppressWarnings("hiding") List<?> _dereference_,
        @SuppressWarnings("hiding") PRvalueArrayElement _rvalueArrayElement_)
    {
        // Constructor
        setDereference(_dereference_);

        setRvalueArrayElement(_rvalueArrayElement_);

    }

    @Override
    public Object clone()
    {
        return new AArrayElementDereferenceTerm(
            cloneList(this._dereference_),
            cloneNode(this._rvalueArrayElement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayElementDereferenceTerm(this);
    }

    public LinkedList<TDereference> getDereference()
    {
        return this._dereference_;
    }

    public void setDereference(List<?> list)
    {
        for(TDereference e : this._dereference_)
        {
            e.parent(null);
        }
        this._dereference_.clear();

        for(Object obj_e : list)
        {
            TDereference e = (TDereference) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._dereference_.add(e);
        }
    }

    public PRvalueArrayElement getRvalueArrayElement()
    {
        return this._rvalueArrayElement_;
    }

    public void setRvalueArrayElement(PRvalueArrayElement node)
    {
        if(this._rvalueArrayElement_ != null)
        {
            this._rvalueArrayElement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rvalueArrayElement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._dereference_)
            + toString(this._rvalueArrayElement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._dereference_.remove(child))
        {
            return;
        }

        if(this._rvalueArrayElement_ == child)
        {
            this._rvalueArrayElement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<TDereference> i = this._dereference_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((TDereference) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._rvalueArrayElement_ == oldChild)
        {
            setRvalueArrayElement((PRvalueArrayElement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

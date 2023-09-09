/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.node;

import java.util.*;
import drlc.analysis.*;

@SuppressWarnings("nls")
public final class ATypeList extends PTypeList
{
    private PType _type_;
    private final LinkedList<PTypeListTail> _typeListTail_ = new LinkedList<PTypeListTail>();
    private TComma _comma_;

    public ATypeList()
    {
        // Constructor
    }

    public ATypeList(
        @SuppressWarnings("hiding") PType _type_,
        @SuppressWarnings("hiding") List<?> _typeListTail_,
        @SuppressWarnings("hiding") TComma _comma_)
    {
        // Constructor
        setType(_type_);

        setTypeListTail(_typeListTail_);

        setComma(_comma_);

    }

    @Override
    public Object clone()
    {
        return new ATypeList(
            cloneNode(this._type_),
            cloneList(this._typeListTail_),
            cloneNode(this._comma_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATypeList(this);
    }

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
    }

    public LinkedList<PTypeListTail> getTypeListTail()
    {
        return this._typeListTail_;
    }

    public void setTypeListTail(List<?> list)
    {
        for(PTypeListTail e : this._typeListTail_)
        {
            e.parent(null);
        }
        this._typeListTail_.clear();

        for(Object obj_e : list)
        {
            PTypeListTail e = (PTypeListTail) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._typeListTail_.add(e);
        }
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._type_)
            + toString(this._typeListTail_)
            + toString(this._comma_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        if(this._typeListTail_.remove(child))
        {
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        for(ListIterator<PTypeListTail> i = this._typeListTail_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PTypeListTail) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

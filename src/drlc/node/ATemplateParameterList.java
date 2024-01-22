/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.node;

import java.util.*;
import drlc.analysis.*;

@SuppressWarnings("nls")
public final class ATemplateParameterList extends PTemplateParameterList
{
    private TLessThan _lessThan_;
    private final LinkedList<PTemplateParameterListHead> _templateParameterListHead_ = new LinkedList<PTemplateParameterListHead>();
    private TName _name_;
    private TComma _comma_;
    private TMoreThan _moreThan_;

    public ATemplateParameterList()
    {
        // Constructor
    }

    public ATemplateParameterList(
        @SuppressWarnings("hiding") TLessThan _lessThan_,
        @SuppressWarnings("hiding") List<?> _templateParameterListHead_,
        @SuppressWarnings("hiding") TName _name_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") TMoreThan _moreThan_)
    {
        // Constructor
        setLessThan(_lessThan_);

        setTemplateParameterListHead(_templateParameterListHead_);

        setName(_name_);

        setComma(_comma_);

        setMoreThan(_moreThan_);

    }

    @Override
    public Object clone()
    {
        return new ATemplateParameterList(
            cloneNode(this._lessThan_),
            cloneList(this._templateParameterListHead_),
            cloneNode(this._name_),
            cloneNode(this._comma_),
            cloneNode(this._moreThan_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATemplateParameterList(this);
    }

    public TLessThan getLessThan()
    {
        return this._lessThan_;
    }

    public void setLessThan(TLessThan node)
    {
        if(this._lessThan_ != null)
        {
            this._lessThan_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lessThan_ = node;
    }

    public LinkedList<PTemplateParameterListHead> getTemplateParameterListHead()
    {
        return this._templateParameterListHead_;
    }

    public void setTemplateParameterListHead(List<?> list)
    {
        for(PTemplateParameterListHead e : this._templateParameterListHead_)
        {
            e.parent(null);
        }
        this._templateParameterListHead_.clear();

        for(Object obj_e : list)
        {
            PTemplateParameterListHead e = (PTemplateParameterListHead) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._templateParameterListHead_.add(e);
        }
    }

    public TName getName()
    {
        return this._name_;
    }

    public void setName(TName node)
    {
        if(this._name_ != null)
        {
            this._name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._name_ = node;
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

    public TMoreThan getMoreThan()
    {
        return this._moreThan_;
    }

    public void setMoreThan(TMoreThan node)
    {
        if(this._moreThan_ != null)
        {
            this._moreThan_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._moreThan_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lessThan_)
            + toString(this._templateParameterListHead_)
            + toString(this._name_)
            + toString(this._comma_)
            + toString(this._moreThan_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lessThan_ == child)
        {
            this._lessThan_ = null;
            return;
        }

        if(this._templateParameterListHead_.remove(child))
        {
            return;
        }

        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._moreThan_ == child)
        {
            this._moreThan_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lessThan_ == oldChild)
        {
            setLessThan((TLessThan) newChild);
            return;
        }

        for(ListIterator<PTemplateParameterListHead> i = this._templateParameterListHead_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PTemplateParameterListHead) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._name_ == oldChild)
        {
            setName((TName) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._moreThan_ == oldChild)
        {
            setMoreThan((TMoreThan) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

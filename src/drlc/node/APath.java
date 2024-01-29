/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.node;

import java.util.*;
import drlc.analysis.*;

@SuppressWarnings("nls")
public final class APath extends PPath
{
    private PPathSegment _pathSegment_;
    private final LinkedList<PPathTail> _pathTail_ = new LinkedList<PPathTail>();

    public APath()
    {
        // Constructor
    }

    public APath(
        @SuppressWarnings("hiding") PPathSegment _pathSegment_,
        @SuppressWarnings("hiding") List<?> _pathTail_)
    {
        // Constructor
        setPathSegment(_pathSegment_);

        setPathTail(_pathTail_);

    }

    @Override
    public Object clone()
    {
        return new APath(
            cloneNode(this._pathSegment_),
            cloneList(this._pathTail_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPath(this);
    }

    public PPathSegment getPathSegment()
    {
        return this._pathSegment_;
    }

    public void setPathSegment(PPathSegment node)
    {
        if(this._pathSegment_ != null)
        {
            this._pathSegment_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pathSegment_ = node;
    }

    public LinkedList<PPathTail> getPathTail()
    {
        return this._pathTail_;
    }

    public void setPathTail(List<?> list)
    {
        for(PPathTail e : this._pathTail_)
        {
            e.parent(null);
        }
        this._pathTail_.clear();

        for(Object obj_e : list)
        {
            PPathTail e = (PPathTail) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._pathTail_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pathSegment_)
            + toString(this._pathTail_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pathSegment_ == child)
        {
            this._pathSegment_ = null;
            return;
        }

        if(this._pathTail_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pathSegment_ == oldChild)
        {
            setPathSegment((PPathSegment) newChild);
            return;
        }

        for(ListIterator<PPathTail> i = this._pathTail_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PPathTail) newChild);
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

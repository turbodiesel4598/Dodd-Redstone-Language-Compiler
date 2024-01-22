/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.node;

import java.util.*;
import drlc.analysis.*;

@SuppressWarnings("nls")
public final class ATupleExpressionList extends PTupleExpressionList
{
    private final LinkedList<PTupleExpressionListHead> _tupleExpressionListHead_ = new LinkedList<PTupleExpressionListHead>();
    private PExpression _expression_;

    public ATupleExpressionList()
    {
        // Constructor
    }

    public ATupleExpressionList(
        @SuppressWarnings("hiding") List<?> _tupleExpressionListHead_,
        @SuppressWarnings("hiding") PExpression _expression_)
    {
        // Constructor
        setTupleExpressionListHead(_tupleExpressionListHead_);

        setExpression(_expression_);

    }

    @Override
    public Object clone()
    {
        return new ATupleExpressionList(
            cloneList(this._tupleExpressionListHead_),
            cloneNode(this._expression_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATupleExpressionList(this);
    }

    public LinkedList<PTupleExpressionListHead> getTupleExpressionListHead()
    {
        return this._tupleExpressionListHead_;
    }

    public void setTupleExpressionListHead(List<?> list)
    {
        for(PTupleExpressionListHead e : this._tupleExpressionListHead_)
        {
            e.parent(null);
        }
        this._tupleExpressionListHead_.clear();

        for(Object obj_e : list)
        {
            PTupleExpressionListHead e = (PTupleExpressionListHead) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._tupleExpressionListHead_.add(e);
        }
    }

    public PExpression getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PExpression node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tupleExpressionListHead_)
            + toString(this._expression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tupleExpressionListHead_.remove(child))
        {
            return;
        }

        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PTupleExpressionListHead> i = this._tupleExpressionListHead_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PTupleExpressionListHead) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

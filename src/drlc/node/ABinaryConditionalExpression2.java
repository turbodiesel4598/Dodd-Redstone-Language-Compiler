/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.node;

import drlc.analysis.*;

@SuppressWarnings("nls")
public final class ABinaryConditionalExpression2 extends PConditionalExpression2
{
    private PConditionalExpression2 _conditionalExpression2_;
    private PComparativeBinaryOp _comparativeBinaryOp_;
    private PConditionalExpression3 _conditionalExpression3_;

    public ABinaryConditionalExpression2()
    {
        // Constructor
    }

    public ABinaryConditionalExpression2(
        @SuppressWarnings("hiding") PConditionalExpression2 _conditionalExpression2_,
        @SuppressWarnings("hiding") PComparativeBinaryOp _comparativeBinaryOp_,
        @SuppressWarnings("hiding") PConditionalExpression3 _conditionalExpression3_)
    {
        // Constructor
        setConditionalExpression2(_conditionalExpression2_);

        setComparativeBinaryOp(_comparativeBinaryOp_);

        setConditionalExpression3(_conditionalExpression3_);

    }

    @Override
    public Object clone()
    {
        return new ABinaryConditionalExpression2(
            cloneNode(this._conditionalExpression2_),
            cloneNode(this._comparativeBinaryOp_),
            cloneNode(this._conditionalExpression3_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABinaryConditionalExpression2(this);
    }

    public PConditionalExpression2 getConditionalExpression2()
    {
        return this._conditionalExpression2_;
    }

    public void setConditionalExpression2(PConditionalExpression2 node)
    {
        if(this._conditionalExpression2_ != null)
        {
            this._conditionalExpression2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._conditionalExpression2_ = node;
    }

    public PComparativeBinaryOp getComparativeBinaryOp()
    {
        return this._comparativeBinaryOp_;
    }

    public void setComparativeBinaryOp(PComparativeBinaryOp node)
    {
        if(this._comparativeBinaryOp_ != null)
        {
            this._comparativeBinaryOp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comparativeBinaryOp_ = node;
    }

    public PConditionalExpression3 getConditionalExpression3()
    {
        return this._conditionalExpression3_;
    }

    public void setConditionalExpression3(PConditionalExpression3 node)
    {
        if(this._conditionalExpression3_ != null)
        {
            this._conditionalExpression3_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._conditionalExpression3_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._conditionalExpression2_)
            + toString(this._comparativeBinaryOp_)
            + toString(this._conditionalExpression3_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._conditionalExpression2_ == child)
        {
            this._conditionalExpression2_ = null;
            return;
        }

        if(this._comparativeBinaryOp_ == child)
        {
            this._comparativeBinaryOp_ = null;
            return;
        }

        if(this._conditionalExpression3_ == child)
        {
            this._conditionalExpression3_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._conditionalExpression2_ == oldChild)
        {
            setConditionalExpression2((PConditionalExpression2) newChild);
            return;
        }

        if(this._comparativeBinaryOp_ == oldChild)
        {
            setComparativeBinaryOp((PComparativeBinaryOp) newChild);
            return;
        }

        if(this._conditionalExpression3_ == oldChild)
        {
            setConditionalExpression3((PConditionalExpression3) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

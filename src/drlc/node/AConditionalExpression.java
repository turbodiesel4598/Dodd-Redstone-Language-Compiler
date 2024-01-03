/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.node;

import drlc.analysis.*;

@SuppressWarnings("nls")
public final class AConditionalExpression extends PConditionalExpression
{
    private PConditionalExpression0 _conditionalExpression0_;

    public AConditionalExpression()
    {
        // Constructor
    }

    public AConditionalExpression(
        @SuppressWarnings("hiding") PConditionalExpression0 _conditionalExpression0_)
    {
        // Constructor
        setConditionalExpression0(_conditionalExpression0_);

    }

    @Override
    public Object clone()
    {
        return new AConditionalExpression(
            cloneNode(this._conditionalExpression0_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConditionalExpression(this);
    }

    public PConditionalExpression0 getConditionalExpression0()
    {
        return this._conditionalExpression0_;
    }

    public void setConditionalExpression0(PConditionalExpression0 node)
    {
        if(this._conditionalExpression0_ != null)
        {
            this._conditionalExpression0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._conditionalExpression0_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._conditionalExpression0_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._conditionalExpression0_ == child)
        {
            this._conditionalExpression0_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._conditionalExpression0_ == oldChild)
        {
            setConditionalExpression0((PConditionalExpression0) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

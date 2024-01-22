/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.node;

import drlc.analysis.*;

@SuppressWarnings("nls")
public final class APrioritizedTernaryExpression extends PTernaryExpression
{
    private PCastExpression _castExpression_;

    public APrioritizedTernaryExpression()
    {
        // Constructor
    }

    public APrioritizedTernaryExpression(
        @SuppressWarnings("hiding") PCastExpression _castExpression_)
    {
        // Constructor
        setCastExpression(_castExpression_);

    }

    @Override
    public Object clone()
    {
        return new APrioritizedTernaryExpression(
            cloneNode(this._castExpression_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrioritizedTernaryExpression(this);
    }

    public PCastExpression getCastExpression()
    {
        return this._castExpression_;
    }

    public void setCastExpression(PCastExpression node)
    {
        if(this._castExpression_ != null)
        {
            this._castExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._castExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._castExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._castExpression_ == child)
        {
            this._castExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._castExpression_ == oldChild)
        {
            setCastExpression((PCastExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.node;

import drlc.analysis.*;

@SuppressWarnings("nls")
public final class AMemberExpression7 extends PExpression7
{
    private PExpression7 _expression7_;
    private TFullStop _fullStop_;
    private PSimpleExpression _simpleExpression_;

    public AMemberExpression7()
    {
        // Constructor
    }

    public AMemberExpression7(
        @SuppressWarnings("hiding") PExpression7 _expression7_,
        @SuppressWarnings("hiding") TFullStop _fullStop_,
        @SuppressWarnings("hiding") PSimpleExpression _simpleExpression_)
    {
        // Constructor
        setExpression7(_expression7_);

        setFullStop(_fullStop_);

        setSimpleExpression(_simpleExpression_);

    }

    @Override
    public Object clone()
    {
        return new AMemberExpression7(
            cloneNode(this._expression7_),
            cloneNode(this._fullStop_),
            cloneNode(this._simpleExpression_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMemberExpression7(this);
    }

    public PExpression7 getExpression7()
    {
        return this._expression7_;
    }

    public void setExpression7(PExpression7 node)
    {
        if(this._expression7_ != null)
        {
            this._expression7_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression7_ = node;
    }

    public TFullStop getFullStop()
    {
        return this._fullStop_;
    }

    public void setFullStop(TFullStop node)
    {
        if(this._fullStop_ != null)
        {
            this._fullStop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fullStop_ = node;
    }

    public PSimpleExpression getSimpleExpression()
    {
        return this._simpleExpression_;
    }

    public void setSimpleExpression(PSimpleExpression node)
    {
        if(this._simpleExpression_ != null)
        {
            this._simpleExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._simpleExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expression7_)
            + toString(this._fullStop_)
            + toString(this._simpleExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expression7_ == child)
        {
            this._expression7_ = null;
            return;
        }

        if(this._fullStop_ == child)
        {
            this._fullStop_ = null;
            return;
        }

        if(this._simpleExpression_ == child)
        {
            this._simpleExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expression7_ == oldChild)
        {
            setExpression7((PExpression7) newChild);
            return;
        }

        if(this._fullStop_ == oldChild)
        {
            setFullStop((TFullStop) newChild);
            return;
        }

        if(this._simpleExpression_ == oldChild)
        {
            setSimpleExpression((PSimpleExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

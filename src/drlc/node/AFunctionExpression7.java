/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.node;

import drlc.analysis.*;

@SuppressWarnings("nls")
public final class AFunctionExpression7 extends PExpression7
{
    private PExpression7 _expression7_;
    private TLPar _lPar_;
    private PExpressionList _expressionList_;
    private TRPar _rPar_;

    public AFunctionExpression7()
    {
        // Constructor
    }

    public AFunctionExpression7(
        @SuppressWarnings("hiding") PExpression7 _expression7_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PExpressionList _expressionList_,
        @SuppressWarnings("hiding") TRPar _rPar_)
    {
        // Constructor
        setExpression7(_expression7_);

        setLPar(_lPar_);

        setExpressionList(_expressionList_);

        setRPar(_rPar_);

    }

    @Override
    public Object clone()
    {
        return new AFunctionExpression7(
            cloneNode(this._expression7_),
            cloneNode(this._lPar_),
            cloneNode(this._expressionList_),
            cloneNode(this._rPar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunctionExpression7(this);
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

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
    }

    public PExpressionList getExpressionList()
    {
        return this._expressionList_;
    }

    public void setExpressionList(PExpressionList node)
    {
        if(this._expressionList_ != null)
        {
            this._expressionList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressionList_ = node;
    }

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expression7_)
            + toString(this._lPar_)
            + toString(this._expressionList_)
            + toString(this._rPar_);
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

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._expressionList_ == child)
        {
            this._expressionList_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
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

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._expressionList_ == oldChild)
        {
            setExpressionList((PExpressionList) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

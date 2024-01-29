/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.node;

import drlc.analysis.*;

@SuppressWarnings("nls")
public final class AConstantDefinition extends PConstantDefinition
{
    private TConst _const_;
    private TName _name_;
    private PTypeAnnotation _typeAnnotation_;
    private TEquals _equals_;
    private PExpression _expression_;
    private TSemicolon _semicolon_;

    public AConstantDefinition()
    {
        // Constructor
    }

    public AConstantDefinition(
        @SuppressWarnings("hiding") TConst _const_,
        @SuppressWarnings("hiding") TName _name_,
        @SuppressWarnings("hiding") PTypeAnnotation _typeAnnotation_,
        @SuppressWarnings("hiding") TEquals _equals_,
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setConst(_const_);

        setName(_name_);

        setTypeAnnotation(_typeAnnotation_);

        setEquals(_equals_);

        setExpression(_expression_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AConstantDefinition(
            cloneNode(this._const_),
            cloneNode(this._name_),
            cloneNode(this._typeAnnotation_),
            cloneNode(this._equals_),
            cloneNode(this._expression_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConstantDefinition(this);
    }

    public TConst getConst()
    {
        return this._const_;
    }

    public void setConst(TConst node)
    {
        if(this._const_ != null)
        {
            this._const_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._const_ = node;
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

    public PTypeAnnotation getTypeAnnotation()
    {
        return this._typeAnnotation_;
    }

    public void setTypeAnnotation(PTypeAnnotation node)
    {
        if(this._typeAnnotation_ != null)
        {
            this._typeAnnotation_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._typeAnnotation_ = node;
    }

    public TEquals getEquals()
    {
        return this._equals_;
    }

    public void setEquals(TEquals node)
    {
        if(this._equals_ != null)
        {
            this._equals_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._equals_ = node;
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

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._const_)
            + toString(this._name_)
            + toString(this._typeAnnotation_)
            + toString(this._equals_)
            + toString(this._expression_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._const_ == child)
        {
            this._const_ = null;
            return;
        }

        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._typeAnnotation_ == child)
        {
            this._typeAnnotation_ = null;
            return;
        }

        if(this._equals_ == child)
        {
            this._equals_ = null;
            return;
        }

        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._const_ == oldChild)
        {
            setConst((TConst) newChild);
            return;
        }

        if(this._name_ == oldChild)
        {
            setName((TName) newChild);
            return;
        }

        if(this._typeAnnotation_ == oldChild)
        {
            setTypeAnnotation((PTypeAnnotation) newChild);
            return;
        }

        if(this._equals_ == oldChild)
        {
            setEquals((TEquals) newChild);
            return;
        }

        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.node;

import drlc.analysis.*;

@SuppressWarnings("nls")
public final class AExcludingInitializationVariableDeclaration extends PVariableDeclaration
{
    private TLet _let_;
    private PDeclarator _declarator_;
    private TSemicolon _semicolon_;

    public AExcludingInitializationVariableDeclaration()
    {
        // Constructor
    }

    public AExcludingInitializationVariableDeclaration(
        @SuppressWarnings("hiding") TLet _let_,
        @SuppressWarnings("hiding") PDeclarator _declarator_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setLet(_let_);

        setDeclarator(_declarator_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AExcludingInitializationVariableDeclaration(
            cloneNode(this._let_),
            cloneNode(this._declarator_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExcludingInitializationVariableDeclaration(this);
    }

    public TLet getLet()
    {
        return this._let_;
    }

    public void setLet(TLet node)
    {
        if(this._let_ != null)
        {
            this._let_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._let_ = node;
    }

    public PDeclarator getDeclarator()
    {
        return this._declarator_;
    }

    public void setDeclarator(PDeclarator node)
    {
        if(this._declarator_ != null)
        {
            this._declarator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declarator_ = node;
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
            + toString(this._let_)
            + toString(this._declarator_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._let_ == child)
        {
            this._let_ = null;
            return;
        }

        if(this._declarator_ == child)
        {
            this._declarator_ = null;
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
        if(this._let_ == oldChild)
        {
            setLet((TLet) newChild);
            return;
        }

        if(this._declarator_ == oldChild)
        {
            setDeclarator((PDeclarator) newChild);
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

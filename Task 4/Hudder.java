/* Hudder.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. Hudder.java */
        class Hudder/*@bgen(jjtree)*/implements HudderTreeConstants, HudderConstants {/*@bgen(jjtree)*/
  protected static JJTHudderState jjtree = new JJTHudderState();public static void main(String[] args) throws ParseException, TokenMgrError {
                        Hudder parser = new Hudder(System.in);
                        SimpleNode tree = parser.Hudder();

                        System.out.println();
                        System.out.println("Program:");
                        HudderDefaultVisitor printVisitor = new HudderDefaultVisitor();
                        tree.jjtAccept(printVisitor, null);



                }

// Parser
  static final public 
SimpleNode Hudder() throws ParseException {/*@bgen(jjtree) Hudder */
  ASTHudder jjtn000 = new ASTHudder(JJTHUDDER);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case FUN:{
          ;
          break;
          }
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        FunctionDef();
      }
      MainProg();
      jj_consume_token(0);
jjtree.closeNodeScope(jjtn000, true);
           jjtc000 = false;
{if ("" != null) return jjtn000;}
    } catch (Throwable jjte000) {
if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  static final public void MainProg() throws ParseException {
    ProgBlock();
  }

  static final public void FunctionDef() throws ParseException {/*@bgen(jjtree) #Func( 2) */
  ASTFunc jjtn000 = new ASTFunc(JJTFUNC);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);Token id;
    try {
      jj_consume_token(FUN);
      id = jj_consume_token(IDENTIFIER);
      jj_consume_token(O_PAR);
      ParamList();
      jj_consume_token(C_PAR);
      ProgBlock();
jjtree.closeNodeScope(jjtn000,  2);
          jjtc000 = false;
jjtn000.value = id.image;
    } catch (Throwable jjte000) {
if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000,  2);
          }
    }
  }

  static final public void ParamList() throws ParseException {/*@bgen(jjtree) #ParamList( 0) */
 ASTParamList jjtn000 = new ASTParamList(JJTPARAMLIST);
 boolean jjtc000 = true;
 jjtree.openNodeScope(jjtn000);Token t;
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        label_2:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case COMMA:{
            ;
            break;
            }
          default:
            jj_la1[1] = jj_gen;
            break label_2;
          }
          jj_consume_token(COMMA);
          jj_consume_token(IDENTIFIER);
        }
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        ;
      }
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000,  0);
          }
    }
  }

  static final public void ProgBlock() throws ParseException {/*@bgen(jjtree) #ProgBlock( 0) */
  ASTProgBlock jjtn000 = new ASTProgBlock(JJTPROGBLOCK);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(START);
      Statements();
      jj_consume_token(STOP);
    } catch (Throwable jjte000) {
if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000,  0);
          }
    }
  }

  static final public void Statements() throws ParseException {
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case HANDBACK:
      case REPEAT:
      case WHENEVER:
      case VAR:
      case OUTPUT:
      case IF:
      case IDENTIFIER:{
        ;
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        break label_3;
      }
      Statement();
      jj_consume_token(SEMI_COLON);
    }
  }

  static final public void Statement() throws ParseException {
    if (jj_2_1(2)) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case VAR:{
        jj_consume_token(VAR);
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        ;
      }
      jj_consume_token(IDENTIFIER);
      jj_consume_token(ASSIGNMENT);
      Expression();
    } else {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENTIFIER:{
        jj_consume_token(IDENTIFIER);
        jj_consume_token(O_PAR);
        ParamListCall();
        jj_consume_token(C_PAR);
        break;
        }
      case OUTPUT:{
        jj_consume_token(OUTPUT);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case IDENTIFIER:
        case NUMBER:
        case PLUS:
        case MINUS:
        case O_PAR:{
          Expression();
          break;
          }
        case STRING:{
          jj_consume_token(STRING);
          break;
          }
        default:
          jj_la1[5] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      case WHENEVER:{
        jj_consume_token(WHENEVER);
        Condition();
        jj_consume_token(DO);
        Statements();
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case OTHERWISE:{
          jj_consume_token(OTHERWISE);
          Statements();
          break;
          }
        default:
          jj_la1[6] = jj_gen;
          ;
        }
        jj_consume_token(STOP);
        break;
        }
      case IF:{
        jj_consume_token(IF);
        Condition();
        jj_consume_token(THEN);
        Statement();
        jj_consume_token(ELSE);
        Statement();
        break;
        }
      case REPEAT:{
        jj_consume_token(REPEAT);
        ProgBlock();
        jj_consume_token(UNTIL);
        jj_consume_token(O_PAR);
        Condition();
        jj_consume_token(C_PAR);
        break;
        }
      case HANDBACK:{
        jj_consume_token(HANDBACK);
        Expression();
        break;
        }
      default:
        jj_la1[7] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void Expression() throws ParseException {
    Term();
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:
      case MINUS:{
        ;
        break;
        }
      default:
        jj_la1[8] = jj_gen;
        break label_4;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:{
        jj_consume_token(PLUS);
        break;
        }
      case MINUS:{
        jj_consume_token(MINUS);
        break;
        }
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      Term();
    }
  }

  static final public void Term() throws ParseException {
    Factor();
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MULT:
      case DIV:{
        ;
        break;
        }
      default:
        jj_la1[10] = jj_gen;
        break label_5;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MULT:{
        jj_consume_token(MULT);
        break;
        }
      case DIV:{
        jj_consume_token(DIV);
        break;
        }
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      Factor();
    }
  }

  static final public void Factor() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFIER:{
      jj_consume_token(IDENTIFIER);
      break;
      }
    case NUMBER:{
      jj_consume_token(NUMBER);
      break;
      }
    case PLUS:
    case MINUS:
    case O_PAR:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:
      case MINUS:{
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PLUS:{
          jj_consume_token(PLUS);
          break;
          }
        case MINUS:{
          jj_consume_token(MINUS);
          break;
          }
        default:
          jj_la1[12] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      default:
        jj_la1[13] = jj_gen;
        ;
      }
      jj_consume_token(O_PAR);
      Expression();
      jj_consume_token(C_PAR);
      break;
      }
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Condition() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NOT:{
      jj_consume_token(NOT);
      Condition();
      break;
      }
    default:
      jj_la1[17] = jj_gen;
      if (jj_2_2(2)) {
        Expression();
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case EQUAL:{
          jj_consume_token(EQUAL);
          break;
          }
        case NOT_EQUAL:{
          jj_consume_token(NOT_EQUAL);
          break;
          }
        case GREATER:{
          jj_consume_token(GREATER);
          break;
          }
        case LESS:{
          jj_consume_token(LESS);
          break;
          }
        case GREATER_EQUAL:{
          jj_consume_token(GREATER_EQUAL);
          break;
          }
        case LESS_EQUAL:{
          jj_consume_token(LESS_EQUAL);
          break;
          }
        default:
          jj_la1[15] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        Expression();
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case O_PAR:{
          jj_consume_token(O_PAR);
          Condition();
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case AND:{
            jj_consume_token(AND);
            break;
            }
          case OR:{
            jj_consume_token(OR);
            break;
            }
          default:
            jj_la1[16] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          Condition();
          jj_consume_token(C_PAR);
          break;
          }
        default:
          jj_la1[18] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    }
  }

  static final public void ParamListCall() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IDENTIFIER:
    case NUMBER:
    case PLUS:
    case MINUS:
    case O_PAR:{
      Expression();
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case COMMA:{
          ;
          break;
          }
        default:
          jj_la1[19] = jj_gen;
          break label_6;
        }
        jj_consume_token(COMMA);
        Expression();
      }
      break;
      }
    default:
      jj_la1[20] = jj_gen;
      ;
    }
  }

  static private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_3R_13()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(25)) {
    jj_scanpos = xsp;
    if (jj_scan_token(26)) return true;
    }
    return false;
  }

  static private boolean jj_3R_11()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(27)) {
    jj_scanpos = xsp;
    if (jj_scan_token(28)) return true;
    }
    return false;
  }

  static private boolean jj_3R_12()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_13()) jj_scanpos = xsp;
    if (jj_scan_token(O_PAR)) return true;
    if (jj_3R_7()) return true;
    return false;
  }

  static private boolean jj_3R_10()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(22)) {
    jj_scanpos = xsp;
    if (jj_scan_token(24)) {
    jj_scanpos = xsp;
    if (jj_3R_12()) return true;
    }
    }
    return false;
  }

  static private boolean jj_3_1()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(16)) jj_scanpos = xsp;
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(ASSIGNMENT)) return true;
    return false;
  }

  static private boolean jj_3R_9()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(25)) {
    jj_scanpos = xsp;
    if (jj_scan_token(26)) return true;
    }
    return false;
  }

  static private boolean jj_3R_8()
 {
    if (jj_3R_10()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_11()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  static private boolean jj_3R_7()
 {
    if (jj_3R_8()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_9()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  static private boolean jj_3_2()
 {
    if (jj_3R_7()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(30)) {
    jj_scanpos = xsp;
    if (jj_scan_token(31)) {
    jj_scanpos = xsp;
    if (jj_scan_token(32)) {
    jj_scanpos = xsp;
    if (jj_scan_token(33)) {
    jj_scanpos = xsp;
    if (jj_scan_token(34)) {
    jj_scanpos = xsp;
    if (jj_scan_token(35)) return true;
    }
    }
    }
    }
    }
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public HudderTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[21];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x20,0x0,0x400000,0x4702c0,0x10000,0x7c00000,0x800,0x4602c0,0x6000000,0x6000000,0x18000000,0x18000000,0x6000000,0x6000000,0x7400000,0xc0000000,0xc000,0x200000,0x0,0x0,0x7400000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x40,0x0,0x0,0x0,0x10,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x10,0xf,0x0,0x0,0x10,0x40,0x10,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[2];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public Hudder(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Hudder(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new HudderTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public Hudder(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new HudderTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public Hudder(HudderTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(HudderTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 21; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[40];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 21; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 40; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 2; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

        }
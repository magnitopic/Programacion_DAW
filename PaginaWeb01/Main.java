package PaginaWeb01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		File file = new File("EjerciciosHerencia04/index.html");
		File styles = new File("EjerciciosHerencia04/style.css");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write("<html>\r\n"
					+ "	<head>\r\n"
					+ "		<link rel=\"stylesheet\" href=\"style.css\" />\r\n"
					+ "        <link href='https://fonts.googleapis.com/css?family=Lato:400,300,700' rel='stylesheet' type='text/css'>\r\n"
					+ "	</head>\r\n"
					+ "	<body>\r\n"
					+ "\r\n"
					+ "<div class=\"container\">\r\n"
					+ "  <div class=\"header\">\r\n"
					+ "    <div class=\"full-name\">\r\n"
					+ "      <span class=\"first-name\">Alex</span> \r\n"
					+ "      <span class=\"last-name\">Aparicio</span>\r\n"
					+ "    </div>\r\n"
					+ "    <div class=\"contact-info\">\r\n"
					+ "      <span class=\"email\">Email: </span>\r\n"
					+ "      <span class=\"email-val\">mymail@gmail.com</span>\r\n"
					+ "      <span class=\"separator\"></span>\r\n"
					+ "      <span class=\"phone\">Phone: </span>\r\n"
					+ "      <span class=\"phone-val\">111-222-3333</span>\r\n"
					+ "    </div>\r\n"
					+ "    \r\n"
					+ "    <div class=\"about\">\r\n"
					+ "      <span class=\"position\">Front-End Developer </span>\r\n"
					+ "      <span class=\"desc\">\r\n"
					+ "        I am a front-end developer with more than 3 years of experience writing html, css, and js. I'm motivated, result-focused and seeking a successful team-oriented company with opportunity to grow. \r\n"
					+ "      </span>\r\n"
					+ "    </div>\r\n"
					+ "  </div>\r\n"
					+ "   <div class=\"details\">\r\n"
					+ "    <div class=\"section\">\r\n"
					+ "      <div class=\"section__title\">Experience</div>\r\n"
					+ "      <div class=\"section__list\">\r\n"
					+ "        <div class=\"section__list-item\">\r\n"
					+ "          <div class=\"left\">\r\n"
					+ "            <div class=\"name\">KlowdBox</div>\r\n"
					+ "            <div class=\"addr\">San Fr, CA</div>\r\n"
					+ "            <div class=\"duration\">Jan 2011 - Feb 2015</div>\r\n"
					+ "          </div>\r\n"
					+ "          <div class=\"right\">\r\n"
					+ "            <div class=\"name\">Fr developer</div>\r\n"
					+ "            <div class=\"desc\">did This and that</div>\r\n"
					+ "          </div>\r\n"
					+ "        </div>\r\n"
					+ "                <div class=\"section__list-item\">\r\n"
					+ "          <div class=\"left\">\r\n"
					+ "            <div class=\"name\">Akount</div>\r\n"
					+ "            <div class=\"addr\">San Monica, CA</div>\r\n"
					+ "            <div class=\"duration\">Jan 2011 - Feb 2015</div>\r\n"
					+ "          </div>\r\n"
					+ "          <div class=\"right\">\r\n"
					+ "            <div class=\"name\">Fr developer</div>\r\n"
					+ "            <div class=\"desc\">did This and that</div>\r\n"
					+ "          </div>\r\n"
					+ "        </div>\r\n"
					+ "\r\n"
					+ "      </div>\r\n"
					+ "    </div>\r\n"
					+ "    <div class=\"section\">\r\n"
					+ "      <div class=\"section__title\">Education</div>\r\n"
					+ "      <div class=\"section__list\">\r\n"
					+ "        <div class=\"section__list-item\">\r\n"
					+ "          <div class=\"left\">\r\n"
					+ "            <div class=\"name\">Sample Institute of technology</div>\r\n"
					+ "            <div class=\"addr\">San Fr, CA</div>\r\n"
					+ "            <div class=\"duration\">Jan 2011 - Feb 2015</div>\r\n"
					+ "          </div>\r\n"
					+ "          <div class=\"right\">\r\n"
					+ "            <div class=\"name\">Fr developer</div>\r\n"
					+ "            <div class=\"desc\">did This and that</div>\r\n"
					+ "          </div>\r\n"
					+ "        </div>\r\n"
					+ "        <div class=\"section__list-item\">\r\n"
					+ "          <div class=\"left\">\r\n"
					+ "            <div class=\"name\">Akount</div>\r\n"
					+ "            <div class=\"addr\">San Monica, CA</div>\r\n"
					+ "            <div class=\"duration\">Jan 2011 - Feb 2015</div>\r\n"
					+ "          </div>\r\n"
					+ "          <div class=\"right\">\r\n"
					+ "            <div class=\"name\">Fr developer</div>\r\n"
					+ "            <div class=\"desc\">did This and that</div>\r\n"
					+ "          </div>\r\n"
					+ "        </div>\r\n"
					+ "\r\n"
					+ "      </div>\r\n"
					+ "      \r\n"
					+ "  </div>\r\n"
					+ "     <div class=\"section\">\r\n"
					+ "      <div class=\"section__title\">Projects</div> \r\n"
					+ "       <div class=\"section__list\">\r\n"
					+ "         <div class=\"section__list-item\">\r\n"
					+ "           <div class=\"name\">DSP</div>\r\n"
					+ "           <div class=\"text\">I am a front-end developer with more than 3 years of experience writing html, css, and js. I'm motivated, result-focused and seeking a successful team-oriented company with opportunity to grow.</div>\r\n"
					+ "         </div>\r\n"
					+ "         \r\n"
					+ "         <div class=\"section__list-item\">\r\n"
					+ "                    <div class=\"name\">DSP</div>\r\n"
					+ "           <div class=\"text\">I am a front-end developer with more than 3 years of experience writing html, css, and js. I'm motivated, result-focused and seeking a successful team-oriented company with opportunity to grow. <a href=\"/login\">link</a>\r\n"
					+ "           </div>\r\n"
					+ "         </div>\r\n"
					+ "       </div>\r\n"
					+ "    </div>\r\n"
					+ "     <div class=\"section\">\r\n"
					+ "       <div class=\"section__title\">Skills</div>\r\n"
					+ "       <div class=\"skills\">\r\n"
					+ "         <div class=\"skills__item\">\r\n"
					+ "           <div class=\"left\"><div class=\"name\">\r\n"
					+ "             Javascript\r\n"
					+ "             </div></div>\r\n"
					+ "           <div class=\"right\">\r\n"
					+ "                          <input  id=\"ck1\" type=\"checkbox\" checked/>\r\n"
					+ "\r\n"
					+ "             <label for=\"ck1\"></label>\r\n"
					+ "                          <input id=\"ck2\" type=\"checkbox\" checked/>\r\n"
					+ "\r\n"
					+ "              <label for=\"ck2\"></label>\r\n"
					+ "                         <input id=\"ck3\" type=\"checkbox\" />\r\n"
					+ "\r\n"
					+ "              <label for=\"ck3\"></label>\r\n"
					+ "                           <input id=\"ck4\" type=\"checkbox\" />\r\n"
					+ "            <label for=\"ck4\"></label>\r\n"
					+ "                          <input id=\"ck5\" type=\"checkbox\" />\r\n"
					+ "              <label for=\"ck5\"></label>\r\n"
					+ "\r\n"
					+ "           </div>\r\n"
					+ "         </div>\r\n"
					+ "         \r\n"
					+ "       </div>\r\n"
					+ "       <div class=\"skills__item\">\r\n"
					+ "           <div class=\"left\"><div class=\"name\">\r\n"
					+ "             CSS</div></div>\r\n"
					+ "           <div class=\"right\">\r\n"
					+ "                          <input  id=\"ck1\" type=\"checkbox\" checked/>\r\n"
					+ "\r\n"
					+ "             <label for=\"ck1\"></label>\r\n"
					+ "                          <input id=\"ck2\" type=\"checkbox\" checked/>\r\n"
					+ "\r\n"
					+ "              <label for=\"ck2\"></label>\r\n"
					+ "                         <input id=\"ck3\" type=\"checkbox\" />\r\n"
					+ "\r\n"
					+ "              <label for=\"ck3\"></label>\r\n"
					+ "                           <input id=\"ck4\" type=\"checkbox\" />\r\n"
					+ "            <label for=\"ck4\"></label>\r\n"
					+ "                          <input id=\"ck5\" type=\"checkbox\" />\r\n"
					+ "              <label for=\"ck5\"></label>\r\n"
					+ "\r\n"
					+ "           </div>\r\n"
					+ "         </div>\r\n"
					+ "         \r\n"
					+ "       </div>\r\n"
					+ "     <div class=\"section\">\r\n"
					+ "     <div class=\"section__title\">\r\n"
					+ "       Interests\r\n"
					+ "       </div>\r\n"
					+ "       <div class=\"section__list\">\r\n"
					+ "         <div class=\"section__list-item\">\r\n"
					+ "                  Football, programming.\r\n"
					+ "          </div>\r\n"
					+ "       </div>\r\n"
					+ "     </div>\r\n"
					+ "     </div>\r\n"
					+ "  </div>\r\n"
					+ "</div>\r\n"
					+ "	</body>\r\n"
					+ "</html>\r\n");
			bw.close();
		} catch (Exception e) {
			System.out.println("Error al escribir: " + e);
		}
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(styles));
			bw.write("* {\r\n"
					+ "    margin: 0;\r\n"
					+ "    padding: 0;\r\n"
					+ "    box-sizing: border-box;\r\n"
					+ "  }\r\n"
					+ "  html {\r\n"
					+ "    height: 100%;  \r\n"
					+ "  }\r\n"
					+ "  \r\n"
					+ "  body {\r\n"
					+ "    min-height: 100%;  \r\n"
					+ "    background: #eee;\r\n"
					+ "    font-family: 'Lato', sans-serif;\r\n"
					+ "    font-weight: 400;\r\n"
					+ "    color: #222;\r\n"
					+ "    font-size: 14px;\r\n"
					+ "    line-height: 26px;\r\n"
					+ "    padding-bottom: 50px;\r\n"
					+ "  }\r\n"
					+ "  \r\n"
					+ "  .container {\r\n"
					+ "    max-width: 700px;   \r\n"
					+ "    background: #fff;\r\n"
					+ "    margin: 0px auto 0px; \r\n"
					+ "    box-shadow: 1px 1px 2px #DAD7D7;\r\n"
					+ "    border-radius: 3px;  \r\n"
					+ "    padding: 40px;\r\n"
					+ "    margin-top: 50px;\r\n"
					+ "  }\r\n"
					+ "  \r\n"
					+ "  .header {\r\n"
					+ "    margin-bottom: 30px;\r\n"
					+ "    \r\n"
					+ "    .full-name {\r\n"
					+ "      font-size: 40px;\r\n"
					+ "      text-transform: uppercase;\r\n"
					+ "      margin-bottom: 5px;\r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    .first-name {\r\n"
					+ "      font-weight: 700;\r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    .last-name {\r\n"
					+ "      font-weight: 300;\r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    .contact-info {\r\n"
					+ "      margin-bottom: 20px;\r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    .email ,\r\n"
					+ "    .phone {\r\n"
					+ "      color: #999;\r\n"
					+ "      font-weight: 300;\r\n"
					+ "    } \r\n"
					+ "    \r\n"
					+ "    .separator {\r\n"
					+ "      height: 10px;\r\n"
					+ "      display: inline-block;\r\n"
					+ "      border-left: 2px solid #999;\r\n"
					+ "      margin: 0px 10px;\r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    .position {\r\n"
					+ "      font-weight: bold;\r\n"
					+ "      display: inline-block;\r\n"
					+ "      margin-right: 10px;\r\n"
					+ "      text-decoration: underline;\r\n"
					+ "    }\r\n"
					+ "  }\r\n"
					+ "  \r\n"
					+ "  \r\n"
					+ "  .details {\r\n"
					+ "    line-height: 20px;\r\n"
					+ "    \r\n"
					+ "    .section {\r\n"
					+ "      margin-bottom: 40px;  \r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    .section:last-of-type {\r\n"
					+ "      margin-bottom: 0px;  \r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    .section__title {\r\n"
					+ "      letter-spacing: 2px;\r\n"
					+ "      color: #54AFE4;\r\n"
					+ "      font-weight: bold;\r\n"
					+ "      margin-bottom: 10px;\r\n"
					+ "      text-transform: uppercase;\r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    .section__list-item {\r\n"
					+ "      margin-bottom: 40px;\r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    .section__list-item:last-of-type {\r\n"
					+ "      margin-bottom: 0;\r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    .left ,\r\n"
					+ "    .right {\r\n"
					+ "      vertical-align: top;\r\n"
					+ "      display: inline-block;\r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    .left {\r\n"
					+ "      width: 60%;    \r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    .right {\r\n"
					+ "      tex-align: right;\r\n"
					+ "      width: 39%;    \r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    .name {\r\n"
					+ "      font-weight: bold;\r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    a {\r\n"
					+ "      text-decoration: none;\r\n"
					+ "      color: #000;\r\n"
					+ "      font-style: italic;\r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    a:hover {\r\n"
					+ "      text-decoration: underline;\r\n"
					+ "      color: #000;\r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    .skills {\r\n"
					+ "      \r\n"
					+ "    }\r\n"
					+ "      \r\n"
					+ "    .skills__item {\r\n"
					+ "      margin-bottom: 10px;  \r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    .skills__item .right {\r\n"
					+ "      input {\r\n"
					+ "        display: none;\r\n"
					+ "      }\r\n"
					+ "      \r\n"
					+ "      label {\r\n"
					+ "        display: inline-block;  \r\n"
					+ "        width: 20px;\r\n"
					+ "        height: 20px;\r\n"
					+ "        background: #C3DEF3;\r\n"
					+ "        border-radius: 20px;\r\n"
					+ "        margin-right: 3px;\r\n"
					+ "      }\r\n"
					+ "      \r\n"
					+ "      input:checked + label {\r\n"
					+ "        background: #79A9CE;\r\n"
					+ "      }\r\n"
					+ "    }\r\n"
					+ "  }");
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

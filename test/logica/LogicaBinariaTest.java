/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amferu
 */
public class LogicaBinariaTest {
    
    public LogicaBinariaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of arreglo method, of class LogicaBinaria.
     */
    @Test
    public void testArreglo() {
        System.out.println("arreglo");
        String cadena = "";
        LogicaBinaria instance = new LogicaBinaria();
        String expResult = "";
        String result = instance.arreglo(cadena);
        assertTrue(true);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarnum method, of class LogicaBinaria.
     */
    @Test
    public void testAgregarnum() {
        System.out.println("agregarnum");
        int a = 5;
        LogicaBinaria instance = new LogicaBinaria();
        instance.agregarnum(a);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getA method, of class LogicaBinaria.
     */
    @Test
    public void testGetA() {
        System.out.println("getA");
        LogicaBinaria instance = new LogicaBinaria();
        int[] expResult = null;
        int[] result = instance.getA();
        System.out.println(instance.getA());
       
        assertTrue(true);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LogicaBinaria.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        int[] a = new int[16];
        LogicaBinaria instance = new LogicaBinaria();
        String expResult = "";
        String result = instance.toString(a);
         assertTrue(true);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of union method, of class LogicaBinaria.
     */
    @Test
    public void testUnion() {
        System.out.println("union");
        int[] b = new int[16];
        b[0]=1;
        LogicaBinaria instance = new LogicaBinaria();
        instance.agregarnum(6);
        instance.agregarnum(2);
        
        String expResult = " 0 2 6";
        String result = instance.union(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of interseccion method, of class LogicaBinaria.
     */
    @Test
    public void testInterseccion() {
        System.out.println("interseccion");
        int[] b = new int[16];
        b[0]=5;
        LogicaBinaria instance = new LogicaBinaria();
        instance.agregarnum(2);
        instance.agregarnum(0);
        String expResult = " 0 2";
        String result = instance.interseccion(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of complemento method, of class LogicaBinaria.
     */
    @Test
    public void testComplemento() {
        System.out.println("complemento");
        LogicaBinaria instance = new LogicaBinaria();
        String expResult = " 0 1 2 3 4 5 6 7 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 96 97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126 128 129 130 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145 146 147 148 149 150 151 152 153 154 155 156 157 158 160 161 162 163 164 165 166 167 168 169 170 171 172 173 174 175 176 177 178 179 180 181 182 183 184 185 186 187 188 189 190 192 193 194 195 196 197 198 199 200 201 202 203 204 205 206 207 208 209 210 211 212 213 214 215 216 217 218 219 220 221 222 224 225 226 227 228 229 230 231 232 233 234 235 236 237 238 239 240 241 242 243 244 245 246 247 248 249 250 251 252 253 254 256 257 258 259 260 261 262 263 264 265 266 267 268 269 270 271 272 273 274 275 276 277 278 279 280 281 282 283 284 285 286 288 289 290 291 292 293 294 295 296 297 298 299 300 301 302 303 304 305 306 307 308 309 310 311 312 313 314 315 316 317 318 320 321 322 323 324 325 326 327 328 329 330 331 332 333 334 335 336 337 338 339 340 341 342 343 344 345 346 347 348 349 350 352 353 354 355 356 357 358 359 360 361 362 363 364 365 366 367 368 369 370 371 372 373 374 375 376 377 378 379 380 381 382 384 385 386 387 388 389 390 391 392 393 394 395 396 397 398 399 400 401 402 403 404 405 406 407 408 409 410 411 412 413 414 416 417 418 419 420 421 422 423 424 425 426 427 428 429 430 431 432 433 434 435 436 437 438 439 440 441 442 443 444 445 446 448 449 450 451 452 453 454 455 456 457 458 459 460 461 462 463 464 465 466 467 468 469 470 471 472 473 474 475 476 477 478 480 481 482 483 484 485 486 487 488 489 490 491 492 493 494 495 496 497 498 499 500 501 502 503 504 505 506 507 508 509 510";
        instance.agregarnum(8);
        String result = instance.complemento();
       
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
